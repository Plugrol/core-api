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

import de.kissenpvp.api.base.documentation.AnomalyUse;
import de.kissenpvp.api.message.language.Sentence;
import de.kissenpvp.api.user.User;
import io.netty.channel.Channel;

import java.util.UUID;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class PlayerClient<T> extends ConnectionClient<T> implements PlayerConnectionClient
{
    protected UUID uuid;
    protected String name;

    /**
     * Returns the UUID of a player.
     *
     * @return The id of the player this interface is about.
     */
    public UUID getUUID()
    {
        return uuid;
    }

    @Override public String getName()
    {
        return name;
    }

    @Override public boolean hasPermission(String permission)
    {
        return getUser().hasPermission(permission);
    }

    /**
     * This method kills the connection between the server and the player.
     * Once this method is performed, communication without reconnecting is impossible.
     */
    @AnomalyUse(value = "Called when a player is crashing or otherwise has to be kicked immediately.") public void killConnection()
    {
        getConnection().close();
    }

    /**
     * Sets the display id of this player.
     *
     * @param name the new display id.
     */
    public abstract void setDisplayName(String name);

    /**
     * Throws a player from the server if it is online.
     *
     * @param message The message that he receives when he is kicked.
     */
    public abstract void kick(String message);

    /**
     * Throws a player from the server if it is online.
     *
     * @param message The message that he receives when he is kicked.
     */
    public abstract void kick(Sentence message);

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
     * sends a packet to the player.
     *
     * @param object The packet to send.
     */
    public abstract void sendPacket(Object object);

    /**
     * Returns the value and signature of a player. These describe the skin. Saving these two values
     * and manually injecting them prevents loading times for heads, for example, or enables the creation of NPC skins.
     *
     * @return Player's value and signature.
     */
    public abstract Skin getSkin();

    /**
     * @return The connection between the player and the server.
     */
    public abstract Channel getConnection();

    /**
     * Returns the user as {@link User}.
     *
     * @return The user as a user.
     */
    public abstract User getUser();

    public record Skin(UUID owner, String value, String signature)
    {
    }
}
