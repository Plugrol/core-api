/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the GNU General Public
 * License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package de.kissenpvp.api.user.rank.event;

import de.kissenpvp.api.event.Cancellable;
import de.kissenpvp.api.event.Event;
import de.kissenpvp.api.user.rank.RankEntry;
import de.kissenpvp.api.user.rank.RankNode;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class RankAssignEvent implements Event, Cancellable
{
    private final RankNode RANK_NODE;
    private final RankEntry RANK_ENTRY;
    private boolean cancelled;

    public RankAssignEvent(RankNode rankNode, RankEntry rankEntry)
    {
        this.RANK_NODE = rankNode;
        this.RANK_ENTRY = rankEntry;
        this.cancelled = false;
    }

    public RankNode getRankNode()
    {
        return RANK_NODE;
    }

    public RankEntry getRankEntry()
    {
        return RANK_ENTRY;
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
