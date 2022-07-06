package de.kissenpvp.api.user.rank.event;

import de.kissenpvp.api.event.Event;
import de.kissenpvp.api.user.rank.RankEntry;
import de.kissenpvp.api.user.rank.RankNode;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class RankExpireEvent implements Event
{
    private final RankNode RANK_NODE;
    private final RankEntry RANK_ENTRY;

    public RankExpireEvent(RankNode rankNode, RankEntry rankEntry)
    {
        this.RANK_NODE = rankNode;
        this.RANK_ENTRY = rankEntry;
    }

    public RankEntry getRankEntry()
    {
        return RANK_ENTRY;
    }

    public RankNode getRankNode()
    {
        return RANK_NODE;
    }
}
