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

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.navercorp.pinpoint.profiler.context.TestableTransactionCounter;
import com.navercorp.pinpoint.profiler.monitor.codahale.AgentStatCollectorFactory;
import com.navercorp.pinpoint.thrift.dto.TJvmThreads;

/**
 * @author dawidmalina
 */
public class ThreadsCollectorTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void test() {
        ThreadsCollector collector = new AgentStatCollectorFactory(new TestableTransactionCounter()).getThreadsCollector();

        logger.debug("collector.getType():{}", collector);
        TJvmThreads collect1 = collector.collect();
        logger.debug("collector.collect():{}", collect1);
        TJvmThreads collect2 = collector.collect();
        logger.debug("collector.collect():{}", collect2);
    }
}
