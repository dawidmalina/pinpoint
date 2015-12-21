/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.monitor.codahale;

import com.navercorp.pinpoint.bootstrap.config.ProfilerConfig;
import com.navercorp.pinpoint.profiler.context.TransactionCounter;
import com.navercorp.pinpoint.profiler.monitor.MonitorName;
import com.navercorp.pinpoint.profiler.monitor.codahale.cpu.CpuLoadCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.cpu.metric.CpuLoadMetricSet;
import com.navercorp.pinpoint.profiler.monitor.codahale.gc.CmsCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.gc.CmsDetailedMetricsCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.gc.G1Collector;
import com.navercorp.pinpoint.profiler.monitor.codahale.gc.G1DetailedMetricsCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.gc.GarbageCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.gc.ParallelCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.gc.ParallelDetailedMetricsCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.gc.SerialCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.gc.SerialDetailedMetricsCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.gc.UnknownGarbageCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.threads.ThreadsCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.tps.TransactionMetricCollector;
import com.navercorp.pinpoint.profiler.monitor.codahale.tps.metric.TransactionMetricSet;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.navercorp.pinpoint.profiler.monitor.codahale.MetricMonitorValues.*;

/**
 * @author emeroad
 * @author harebox
 * @author hyungil.jeong
 */
public class AgentStatCollectorFactory {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final MetricMonitorRegistry monitorRegistry;
    private final GarbageCollector garbageCollector;
    private final CpuLoadCollector cpuLoadCollector;
    private final TransactionMetricCollector transactionMetricCollector;
    private final ThreadsCollector threadsCollector;

    public AgentStatCollectorFactory(TransactionCounter transactionCounter, ProfilerConfig profilerConfig) {
        this.monitorRegistry = createRegistry();
        this.garbageCollector = createGarbageCollector(profilerConfig.isProfilerJvmCollectDetailedMetrics());
        this.cpuLoadCollector = createCpuLoadCollector();
        this.transactionMetricCollector = createTransactionMetricCollector(transactionCounter);
        this.threadsCollector = createThreadsCollector();
    }

    private MetricMonitorRegistry createRegistry() {
        final MetricMonitorRegistry monitorRegistry = new MetricMonitorRegistry();
        return monitorRegistry;
    }

    /**
     * create with garbage collector types based on metric registry keys
     */
    private GarbageCollector createGarbageCollector(boolean collectDetailedMetrics) {
        MetricMonitorRegistry registry = this.monitorRegistry;
        registry.registerJvmMemoryMonitor(new MonitorName(MetricMonitorValues.JVM_MEMORY));
        registry.registerJvmGcMonitor(new MonitorName(MetricMonitorValues.JVM_GC));

        Collection<String> keys = registry.getRegistry().getNames();
        GarbageCollector garbageCollectorToReturn = new UnknownGarbageCollector();

        if (collectDetailedMetrics) {
            if (keys.contains(JVM_GC_SERIAL_OLDGEN_COUNT)) {
                garbageCollectorToReturn = new SerialDetailedMetricsCollector(registry);
            } else if (keys.contains(JVM_GC_PS_OLDGEN_COUNT)) {
                garbageCollectorToReturn = new ParallelDetailedMetricsCollector(registry);
            } else if (keys.contains(JVM_GC_CMS_OLDGEN_COUNT)) {
                garbageCollectorToReturn = new CmsDetailedMetricsCollector(registry);
            } else if (keys.contains(JVM_GC_G1_OLDGEN_COUNT)) {
                garbageCollectorToReturn = new G1DetailedMetricsCollector(registry);
            }
        } else {
            if (keys.contains(JVM_GC_SERIAL_OLDGEN_COUNT)) {
                garbageCollectorToReturn = new SerialCollector(registry);
            } else if (keys.contains(JVM_GC_PS_OLDGEN_COUNT)) {
                garbageCollectorToReturn = new ParallelCollector(registry);
            } else if (keys.contains(JVM_GC_CMS_OLDGEN_COUNT)) {
                garbageCollectorToReturn = new CmsCollector(registry);
            } else if (keys.contains(JVM_GC_G1_OLDGEN_COUNT)) {
                garbageCollectorToReturn = new G1Collector(registry);
            }
        }

        if (logger.isInfoEnabled()) {
            logger.info("found : {}", garbageCollectorToReturn);
        }
        return garbageCollectorToReturn;
    }

    private CpuLoadCollector createCpuLoadCollector() {
        CpuLoadMetricSet cpuLoadMetricSet = this.monitorRegistry.registerCpuLoadMonitor(new MonitorName(MetricMonitorValues.CPU_LOAD));
        if (logger.isInfoEnabled()) {
            logger.info("loaded : {}", cpuLoadMetricSet);
        }
        return new CpuLoadCollector(cpuLoadMetricSet);
    }

    private TransactionMetricCollector createTransactionMetricCollector(TransactionCounter transactionCounter) {
        TransactionMetricSet transactionMetricSet = this.monitorRegistry.registerTpsMonitor(new MonitorName(MetricMonitorValues.TRANSACTION), transactionCounter);
        if (logger.isInfoEnabled()) {
            logger.info("loaded : {}", transactionMetricSet);
        }
        return new TransactionMetricCollector(transactionMetricSet);
    }

    private ThreadsCollector createThreadsCollector() {
        ThreadStatesGaugeSet threadsMetricSet = this.monitorRegistry.registerJvmThreadStatesMonitor(new MonitorName(MetricMonitorValues.THREAD_STATES));
        if (logger.isInfoEnabled()) {
            logger.info("loaded : Default ThreadStatesGaugeSet");
        }
        return new ThreadsCollector(threadsMetricSet);
    }

    public GarbageCollector getGarbageCollector() {
        return this.garbageCollector;
    }

    public CpuLoadCollector getCpuLoadCollector() {
        return this.cpuLoadCollector;
    }

    public TransactionMetricCollector getTransactionMetricCollector() {
        return this.transactionMetricCollector;
    }

    public ThreadsCollector getThreadsCollector() {
        return this.threadsCollector;
    }

}
