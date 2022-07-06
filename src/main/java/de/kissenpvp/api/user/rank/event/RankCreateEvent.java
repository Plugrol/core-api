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
