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
