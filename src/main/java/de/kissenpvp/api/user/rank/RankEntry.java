package de.kissenpvp.api.user.rank;

import java.util.List;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface RankEntry
{
    void addRank(RankNode rankNode);

    RankNode getRank();

    List<RankNode> getHistory();

    int getRankPointer();
}
