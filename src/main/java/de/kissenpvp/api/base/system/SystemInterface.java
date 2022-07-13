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

package de.kissenpvp.api.base.system;

import de.kissenpvp.api.base.plugin.KissenPlugin;
import de.kissenpvp.api.command.CommandDescription;
import de.kissenpvp.api.networking.socket.SocketEntity;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface SystemInterface extends TaskSystem, EntitySystem, LogSystem
{

    /**
     * Interface for registering commands.
     * Here you can enter the information about a command and the system forwards this to the respective server system.
     *
     * @param commandDescriptor The command to be added.
     */
    void registerCommand(CommandDescription commandDescriptor);

    /**
     * Returns whether the passed class is a listener.
     *
     * @param clazz The class to be checked.
     * @return Whether it's a listener.
     */
    boolean isListener(Class<?> clazz);

    /**
     * Interface for registering listener.
     * Here you can enter the information about a listener and the system forwards this to the respective server system.
     *
     * @param listener The listener to be added.
     * @param plugin   The plugin that registers the listener.
     */
    void registerListener(Object listener, KissenPlugin plugin);

    /**
     * Returns the port on which the server is running.
     *
     * @return the port of the server.
     */
    int getPort();

    /**
     * Returns the networking client of the server. Which can be a {@link de.kissenpvp.api.networking.client.SocketClient} or a {@link de.kissenpvp.api.networking.server.SocketServer} depending on whether this is the spigot or the proxy server.
     *
     * @return the connection client.
     */
    SocketEntity getSocketEntity();

}
