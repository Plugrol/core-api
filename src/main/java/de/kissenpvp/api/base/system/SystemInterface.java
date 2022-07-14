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
