/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the Apache
 * License as published by the Apache Software Foundation,
 * either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Apache License for more details.
 *
 * You should have received a copy of the Apache License
 * along with this program. If not, see <https://www.apache.org/licenses/LICENSE-2.0>.
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
