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

package de.kissenpvp.api.user.rank.event;

import de.kissenpvp.api.event.Cancellable;
import de.kissenpvp.api.event.Event;
import de.kissenpvp.api.user.rank.RankIDNode;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class RankCreateEvent implements Event, Cancellable
{

    private RankIDNode rankIDNode;
    private boolean cancelled;

    public RankCreateEvent(RankIDNode rankIDNode)
    {
        this.rankIDNode = rankIDNode;
        this.cancelled = false;
    }

    public RankIDNode getRank()
    {
        return rankIDNode;
    }

    public void setRankIDNode(RankIDNode rankIDNode)
    {
        this.rankIDNode = rankIDNode;
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
