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
