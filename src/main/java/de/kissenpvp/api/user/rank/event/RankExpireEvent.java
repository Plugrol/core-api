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
