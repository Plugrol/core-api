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

package de.kissenpvp.api.util;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record TimeNode(long length, long start, long end, long predictedEnd)
{
    /**
     * Changes the time this {@link TimeNode} will last, by creating a new one using the same parameters but changing the {@link #end} variable.
     *
     * @param end the new end variable which should be set.
     * @return the new created time node, which then can be updated somewhere.
     */
    public TimeNode setEnd(long end)
    {
        return new TimeNode(length, start, end, predictedEnd);
    }

    public boolean isValid()
    {
        return end > System.currentTimeMillis();
    }

    public boolean hasChanged()
    {
        return end != predictedEnd;
    }
}
