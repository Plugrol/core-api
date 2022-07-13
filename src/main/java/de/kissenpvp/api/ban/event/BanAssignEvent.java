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

package de.kissenpvp.api.ban.event;

import de.kissenpvp.api.ban.BanEntry;
import de.kissenpvp.api.ban.BanNode;
import de.kissenpvp.api.event.Cancellable;
import de.kissenpvp.api.event.Event;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class BanAssignEvent implements Event, Cancellable
{
    private final BanNode BAN_NODE;
    private final BanEntry BAN_ENTRY;
    private boolean cancelled;

    public BanAssignEvent(BanNode banNode, BanEntry banEntry)
    {
        this.BAN_NODE = banNode;
        this.BAN_ENTRY = banEntry;
        this.cancelled = false;
    }

    public BanNode getBanNode()
    {
        return BAN_NODE;
    }

    public BanEntry getBanEntry()
    {
        return BAN_ENTRY;
    }

    @Override public boolean isCancelled()
    {
        return cancelled;
    }

    @Override public void setCancelled(boolean cancel)
    {
        cancelled = cancel;
    }
}
