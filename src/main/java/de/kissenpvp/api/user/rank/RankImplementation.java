package de.kissenpvp.api.user.rank;

import java.util.Set;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface RankImplementation
{
    boolean createRank(RankNode banIDNode) throws RankNameAlreadyUsedException;

    boolean deleteRank(String rankName);

    RankIDNode getRank(String rankName);

    Set<RankNode> getRankList();

}
