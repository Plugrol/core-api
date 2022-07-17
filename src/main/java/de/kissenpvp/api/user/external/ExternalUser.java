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

package de.kissenpvp.api.user.external;

import de.kissenpvp.api.user.User;

import java.util.Map;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ExternalUser
{

    /**
     * Fetches the base user from the main class and returns it.
     *
     * @return The Base user.
     */
    User getUser ();

    /**
     * Called at the login event, which means when the player tries to connect.
     */
    void setup ();

    /**
     * Is called, when a player finished login and has joined on the server for the first time.
     */
    void handshake ();

    /**
     * Is called, when the player finished login and is now fully present on the server.
     */
    void login ();

    /**
     * Is called, when a player is about to quit the server.
     */
    void logout ();

    /**
     * Is called, when the user was edited by another system and now this system needs to reload this user.
     *
     * @param reason The reason why the update is being made.
     * @param data   The data that can optionally be sent.
     */
    void update (String reason, Object... data);

    /**
     * This is the method that is carried out at certain intervals.
     * When filling you should be careful not to add too much, as this can result in significant performance disadvantages.
     */
    void tick ();

    /**
     * With this method information about a player can be stored in the given {@link Map}, which is used with the see command.
     *
     * @param information The map that contains all the information.
     */
    void insertInfo (Map<String, String> information);
}
