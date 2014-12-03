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
package org.onlab.onos.net.packet;

import org.onlab.onos.net.ConnectPoint;
import org.onlab.packet.Ethernet;

import java.nio.ByteBuffer;

/**
 * Represents a data packet intercepted from an infrastructure device.
 */
public interface InboundPacket {

    /**
     * Returns the device and port from where the packet was received.
     *
     * @return connection point where received
     */
    ConnectPoint receivedFrom();

    /**
     * Returns the parsed form of the packet.
     *
     * @return parsed Ethernet frame; null if the packet is not an Ethernet
     * frame or one for which there is no parser
     */
    Ethernet parsed();

    /**
     * Unparsed packet data.
     *
     * @return raw packet bytes
     */
    ByteBuffer unparsed();

}