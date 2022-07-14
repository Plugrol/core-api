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

import de.kissenpvp.api.ban.BanIDNode;
import de.kissenpvp.api.event.Cancellable;
import de.kissenpvp.api.event.Event;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class BanCreateEvent implements Event, Cancellable
{

    private BanIDNode banIDNode;
    private boolean cancelled;

    public BanCreateEvent(BanIDNode banIDNode)
    {
        this.banIDNode = banIDNode;
        this.cancelled = false;
    }

    public BanIDNode getBan()
    {
        return banIDNode;
    }

    public void setBanIDNode(BanIDNode rankIDNode)
    {
        this.banIDNode = rankIDNode;
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
