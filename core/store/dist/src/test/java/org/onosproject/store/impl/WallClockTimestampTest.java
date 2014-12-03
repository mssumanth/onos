/*
 * Copyright 2014 Open Networking Laboratory
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
package org.onlab.onos.store.impl;

import static org.junit.Assert.assertTrue;

import java.nio.ByteBuffer;

import org.junit.Test;
import org.onlab.onos.store.Timestamp;
import org.onlab.util.KryoNamespace;

import com.google.common.testing.EqualsTester;

/**
 * Tests for {@link WallClockTimestamp}.
 */
public class WallClockTimestampTest {

    @Test
    public final void testBasic() throws InterruptedException {
        WallClockTimestamp ts1 = new WallClockTimestamp();
        Thread.sleep(50);
        WallClockTimestamp ts2 = new WallClockTimestamp();

        assertTrue(ts1.compareTo(ts1) == 0);
        assertTrue(ts2.compareTo(ts1) > 0);
        assertTrue(ts1.compareTo(ts2) < 0);
    }

    @Test
    public final void testKryoSerializable() {
        WallClockTimestamp ts1 = new WallClockTimestamp();
        final ByteBuffer buffer = ByteBuffer.allocate(1 * 1024 * 1024);
        final KryoNamespace kryos = KryoNamespace.newBuilder()
                .register(WallClockTimestamp.class)
                .build();

        kryos.serialize(ts1, buffer);
        buffer.flip();
        Timestamp copy = kryos.deserialize(buffer);

        new EqualsTester()
            .addEqualityGroup(ts1, copy)
            .testEquals();
    }
}