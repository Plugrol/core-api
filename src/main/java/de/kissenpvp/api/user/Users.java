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

package de.kissenpvp.api.user;

import de.kissenpvp.api.base.Implementation;
import de.kissenpvp.api.database.savable.SavableMap;
import de.kissenpvp.api.networking.client.entitiy.PlayerClient;
import de.kissenpvp.api.user.external.ExternalUser;

import java.util.List;
import java.util.UUID;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Users extends Implementation
{

    /**
     * Returns all users that are cached because they are on the network.
     *
     * @return The players online.
     */
    List<User> getOnlineUser();

    /**
     * Returns a player based on his UUID.
     *
     * @param uuid The uuid of the player to get.
     * @return The user who has to be online, otherwise it will return null.
     * @see #getUser(UUID) (UUID)
     */
    User getOnlineUser(UUID uuid);

    /**
     * Checks whether a player has a valid user account in the database of the network.
     * Note! An account can be created by banning the user or assigning permission. It's not safe that the player really played once.
     * <p>
     * When you want to check if the player never played than create two seperated checks first validate and the check the online time of the player.<br>
     * It would look like
     * #isValid(UUID) && {@link User#getOnlineTime()} &gt; 0<br>
     * This way is safe when it comes to check if the player played once.
     *
     * @param uuid The uuid of the player that should be validated.
     * @return Whether the uuid does have an account in the database.
     */
    boolean isValid(UUID uuid);

    /**
     * Returns a user account, by its {@link UUID}.
     * Note! When the user is not online this will load the user's data out of the database.
     * In case the user has never played, this method will create a new account.
     * <p>
     * This can be very critical to the performance, when creating many profiles at once.
     * I would recommend loading profiles asynchronously when possible.
     * <p>
     * However, when the player is online, his account will be loaded out of the {@link #getOnlineUser(UUID)} method. Which does save some resources. God bless.
     *
     * @param uuid The uuid of the player to get.
     * @return The user who can be loaded, which depends on whether he is online.
     * @see #getOnlineUser(UUID)
     * @see PlayerClient#getUser()
     */
    User getUser(UUID uuid);

    /**
     * Returns an {@link ExternalUser} by the uuid of the base user.
     *
     * @param externalUserClass The class of the external user.
     * @param uuid              The uuid of the base user.
     * @param <T>               The type of the external user.
     * @return The external loaded by the {@link User}
     */
    <T extends ExternalUser> T getExternalUser(Class<? extends ExternalUser> externalUserClass, UUID uuid);

    /**
     * Calls an update, which can call functions in the {@link User}.
     * In the UserCore {@link ExternalUser#update(String, Object...)} will be called.
     * <p>
     * What's different about this method than {@link #postUpdate(SavableMap, String, Object...)} (SavableMap, UUID, String, Object...)} is that a command is sent to the other servers that causes them to update as well.
     *
     * @param playerClient The player.
     * @param reason       The reason for the update.
     * @param data         The data, which is sent with the update call.
     */
    void update(PlayerClient<?> playerClient, String reason, Object... data);

    /**
     * Calls an update, which can call functions in the {@link User}.
     * In the UserCore {@link ExternalUser#update(String, Object...)} will be called.
     *
     * @param savableMap The new data to insert, which has to be sent due to performance.
     * @param reason     The reason for the update.
     * @param data       The data, which is sent with the update call.
     */
    void postUpdate(SavableMap savableMap, String reason, Object... data);

    /**
     * Loads a user into the system.
     * This is called, when the clients start to connect to the server.
     *
     * @param playerClient The player interface, that holds important information.
     */
    boolean loadUser(PlayerClient<?> playerClient);

    /**
     * Calls a method to log the user in, which is called, when he is already full registered by the server.
     *
     * @param playerClient The player interface, that holds important information.
     */
    void loginUser(PlayerClient<?> playerClient);

    /**
     * Logs out a user and clears his data out of the cache.
     *
     * @param playerClient The player interface, that holds important information.
     */
    boolean logoutUser(PlayerClient<?> playerClient);

}
