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
package org.onlab.onos.net.topology;

import com.google.common.collect.ImmutableSet;
import org.onlab.onos.net.Description;

/**
 * Describes attribute(s) of a network graph.
 */
public interface GraphDescription extends Description {

    /**
     * Returns the creation timestamp of the graph description. This is
     * expressed in system nanos to allow proper sequencing.
     *
     * @return graph description creation timestamp
     */
    long timestamp();

    /**
     * Returns the set of topology graph vertexes.
     *
     * @return set of graph vertexes
     */
    ImmutableSet<TopologyVertex> vertexes();

    /**
     * Returns the set of topology graph edges.
     *
     * @return set of graph edges
     */
    ImmutableSet<TopologyEdge> edges();

}
