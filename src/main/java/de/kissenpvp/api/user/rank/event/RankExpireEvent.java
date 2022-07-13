/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the Apache
 * License as published by the Apache Software Foundation,
 * either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Apache License for more details.
 *
 * You should have received a copy of the Apache License
 * along with this program. If not, see <https://www.apache.org/licenses/LICENSE-2.0>.
 */

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
