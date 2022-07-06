package de.kissenpvp.api.user.rank.event;

import de.kissenpvp.api.event.Cancellable;
import de.kissenpvp.api.event.Event;
import de.kissenpvp.api.user.rank.RankIDNode;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class RankDeleteEvent implements Event, Cancellable
{
    private final RankIDNode RANK_ID_NODE;
    private boolean cancelled;

    public RankDeleteEvent(RankIDNode RANK_ID_NODE)
    {
        this.RANK_ID_NODE = RANK_ID_NODE;
        this.cancelled = false;
    }

    public RankIDNode getRank()
    {
        return RANK_ID_NODE;
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
