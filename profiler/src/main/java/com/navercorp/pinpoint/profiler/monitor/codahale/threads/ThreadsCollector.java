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

package com.navercorp.pinpoint.profiler.monitor.codahale.threads;

import static com.navercorp.pinpoint.profiler.monitor.codahale.MetricMonitorValues.*;

import java.util.Map;

import com.codahale.metrics.Gauge;
import com.codahale.metrics.Metric;
import com.codahale.metrics.jvm.ThreadStatesGaugeSet;
import com.navercorp.pinpoint.profiler.monitor.codahale.AgentStatCollector;
import com.navercorp.pinpoint.thrift.dto.TJvmThreads;

/**
 * @author dawidmalina
 */
public class ThreadsCollector implements AgentStatCollector<TJvmThreads> {

    private final Gauge<Integer> timedWaitingCount;
    private final Gauge<Integer> waitingCount;
    private final Gauge<Integer> newCount;
    private final Gauge<Integer> blockedCount;
    private final Gauge<Integer> runnableCount;
    private final Gauge<Integer> terminatedCount;

    public ThreadsCollector(ThreadStatesGaugeSet threadsMetricSet) {
        if (threadsMetricSet == null) {
            throw new NullPointerException("threadsMetricSet must not be null");
        }
        final Map<String, Metric> metrics = threadsMetricSet.getMetrics();
        this.newCount = getIntegerGauge(metrics, THREAD_STATE_NEW, INTEGER_ZERO);
        this.runnableCount = getIntegerGauge(metrics, THREAD_STATE_RUNNABLE, INTEGER_ZERO);
        this.blockedCount = getIntegerGauge(metrics, THREAD_STATE_BLOCKED, INTEGER_ZERO);
        this.waitingCount = getIntegerGauge(metrics, THREAD_STATE_WAITING, INTEGER_ZERO);
        this.timedWaitingCount = getIntegerGauge(metrics, THREAD_STATE_TIMED_WAITING, INTEGER_ZERO);
        this.terminatedCount = getIntegerGauge(metrics, THREAD_STATE_TERMINATED, INTEGER_ZERO);
    }

    @Override
    public TJvmThreads collect() {
        final TJvmThreads threads = new TJvmThreads();
        threads.setNewCount(this.newCount.getValue());
        threads.setRunnableCount(this.runnableCount.getValue());
        threads.setBlockedCount(this.blockedCount.getValue());
        threads.setWaitingCount(this.waitingCount.getValue());
        threads.setTimedWaitingCount(this.timedWaitingCount.getValue());
        threads.setTerminatedCount(this.terminatedCount.getValue());
        return threads;
    }

}
