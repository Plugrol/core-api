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

package de.kissenpvp.api.networking.client.entitiy;


import de.kissenpvp.api.message.ChatComponent;
import de.kissenpvp.api.message.language.Sentence;
import de.kissenpvp.api.networking.client.Client;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class ConnectionClient<T> extends Client
{
    /**
     * Returns the player as an object. This object is different from system to system.
     *
     * @return The player as an object.
     */
    public abstract T getObject();

    /**
     * Returns the id of a player.
     *
     * @return The id of the player this interface is about.
     */
    public abstract String getName();

    /**
     * Sends a message to the player in the language the player's using.
     *
     * @param sentence The sentence that should be sent.
     */
    public abstract void sendMessage(Sentence sentence);

    /**
     * Sends a raw message to the player in the language the player's using.
     *
     * @param sentence The sentence that should be sent.
     */
    public abstract void sendRawMessage(Sentence sentence);

    /**
     * Sends a message to the player this class represents.
     * Only creates a {@link ChatComponent} and invokes it to the next method.
     *
     * @param message The message to be sent to the player.
     * @see #sendMessage(ChatComponent...)
     */
    public void sendMessage(String message)
    {
        sendMessage(() -> message);
    }

    /**
     * Sends a message to the player designed in a {@link ChatComponent}.
     *
     * @param message The message to send.
     */
    public abstract void sendMessage(ChatComponent... message);

    /**
     * Indicates whether a player has a permission.
     *
     * @param permission The permission to check for.
     * @return whether he has the given permission or not.
     */
    public abstract boolean hasPermission(String permission);

    /**
     * The server of the client.
     * Note! When it is the console of the proxy, or the player is offline, it'll return null.
     *
     * @return The server of the client.
     */
    public abstract String getServer();

    public String getLanguage()
    {
        return "en_GB";
    }

}