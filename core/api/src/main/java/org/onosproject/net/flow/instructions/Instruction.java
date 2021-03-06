/*
 * Copyright 2014-2015 Open Networking Laboratory
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
package org.onosproject.net.flow.instructions;

/**
 * Abstraction of a single traffic treatment step.
 */
public interface Instruction {

    /**
     * Represents the type of traffic treatment.
     */
    enum Type {
        /**
         * Signifies that the traffic should be dropped.
         */
        DROP,

        /**
         * Signifies that the traffic should be output to a port.
         */
        OUTPUT,

        /**
         * Signifies that traffic should be sent out of a group.
         */
        GROUP,

        /**
         * Signifies that the traffic should be modified in L0 way.
         */
        L0MODIFICATION,

        /**
         * Signifies that the traffic should be modified in L2 way.
         */
        L2MODIFICATION,

        /**
         * Signifies that the traffic should be passed to another table.
         */
        TABLE,

        /**
         * Signifies that the traffic should be modified in L3 way.
         */
        L3MODIFICATION,

        /**
         * Signifies that metadata be attached to traffic.
         */
        METADATA
    }

    /**
     * Returns the type of instruction.
     * @return type of instruction
     */
    Type type();

}
