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

import de.kissenpvp.api.networking.client.entitiy.ConnectionClient;
import de.kissenpvp.api.networking.client.entitiy.MojangFetchException;
import de.kissenpvp.api.networking.client.entitiy.PlayerClient;
import de.kissenpvp.api.networking.socket.SocketEntity;
import de.kissenpvp.api.permission.PermissionAgentNode;

import java.util.UUID;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface EntitySystem
{
    SocketEntity getSocketEntity();

    /**
     * Returns a cross player based on his id.
     *
     * @param name The id of the player to return him as a {@link PlayerClient}.
     * @return A cross player who forms the bridge between the core and the respective system.
     */
    PlayerClient<?> getPlayer(String name) throws MojangFetchException;

    /**
     * Returns a cross player based on his uuid.
     *
     * @param uuid The uuid of the player to return him as a {@link PlayerClient}.
     * @return A cross player who forms the bridge between the core and the respective system.
     */
    PlayerClient<?> getPlayer(UUID uuid) throws MojangFetchException;

    /**
     * Returns a cross player based on his uuid.
     *
     * @param uuid The uuid of the player to return him as a {@link PlayerClient}.
     * @param name The id of the player to return him as a {@link PlayerClient}.
     * @return A cross player who forms the bridge between the core and the respective system.
     */
    PlayerClient<?> getPlayer(UUID uuid, String name);

    boolean isOnline(UUID uuid);

    boolean isOnline(String name);

    /**
     * Returns the console as {@link ConnectionClient}.
     *
     * @return the console
     */
    ConnectionClient<?> getConsole();

    PermissionAgentNode getConsoleAgent();

    /**
     * Injects the reader to read and, if necessary, intercept packets.
     *
     * @param playerClient The client to be scanned.
     */
    void injectPacketReader(PlayerClient<?> playerClient);

    /**
     * Removes the reader from the pipeline so that it no longer causes errors.
     *
     * @param playerClient The client from which the reader is to be removed.
     */
    void removePacketReader(PlayerClient<?> playerClient);
}
