/*
 *  Copyright 14.07.2022 KissenPvP
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package de.kissenpvp.api.base;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Implementation
{
    /**
     * The pre start phase is executed when staring the server, unlike {@link #start()} and {@link #postStart()} there is a high chance that things are not initialised yet.
     * It is used to load up things which should be set when running {@link #start()}
     *
     * @return whether it was successful or something failed.
     */
    default boolean preStart()
    {
        return true;
    }

    /**
     * This is the main start phase and is executed when the server is about to start. It is there to load up implementations and kissen plugins.
     *
     * @return whether it was successful or something failed.
     */
    default boolean start()
    {
        return true;
    }

    /**
     * The post start is important when everything needs to be set when executing this method. It'll run after {@link #start()}
     *
     * @return whether it was successful or something failed.
     */
    default boolean postStart()
    {
        return true;
    }

    /**
     * This method is called when the server is shutting down.
     */
    default void stop()
    {
    }
}
