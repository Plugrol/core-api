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
