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

package de.kissenpvp.api.networking.client.entitiy.packet;

import de.kissenpvp.api.event.Cancellable;
import de.kissenpvp.api.event.Event;
import de.kissenpvp.api.networking.client.entitiy.PlayerClient;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class PacketWriteEvent implements Event, Cancellable
{
    private final PlayerClient<?> PLAYER_CLIENT;
    private Object packet;

    private boolean cancelled;

    public PacketWriteEvent(PlayerClient<?> PLAYER_CLIENT, Object packet)
    {
        this.PLAYER_CLIENT = PLAYER_CLIENT;
        this.packet = packet;
        this.cancelled = false;
    }

    @Override public boolean isCancelled()
    {
        return cancelled;
    }

    @Override public void setCancelled(boolean cancel)
    {
        this.cancelled = cancel;
    }

    public PlayerClient<?> getPlayerClient()
    {
        return PLAYER_CLIENT;
    }

    public Object getPacket()
    {
        return packet;
    }

    public void setPacket(Object packet)
    {
        this.packet = packet;
    }
}
