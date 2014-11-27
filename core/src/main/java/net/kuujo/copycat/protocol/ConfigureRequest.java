/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.kuujo.copycat.protocol;

import net.kuujo.copycat.cluster.ClusterConfig;

/**
 * Protocol configure request.
 *
 * @author <a href="http://github.com/kuujo">Jordan Halterman</a>
 */
public interface ConfigureRequest extends Request {

  /**
   * Returns a new configure request builder.
   *
   * @return A new configure request builder.
   */
  static Builder builder() {
    return null;
  }

  /**
   * Returns the request configuration.
   *
   * @return The request configuration.
   */
  ClusterConfig config();

  /**
   * Configure request builder.
   */
  static interface Builder extends Request.Builder<Builder, ConfigureRequest> {

    /**
     * Sets the request cluster configuration.
     *
     * @param config The request cluster configuration.
     * @return The configure request builder.
     */
    Builder withConfig(ClusterConfig config);

  }

}