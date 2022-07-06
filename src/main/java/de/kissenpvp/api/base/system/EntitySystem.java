/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the GNU General Public
 * License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
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
