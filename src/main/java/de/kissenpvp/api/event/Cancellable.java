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

package de.kissenpvp.api.event;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Cancellable
{
    /**
     * Gets the cancellation state of this event. A cancelled event will not be executed in the server, but will still pass to other plugins
     *
     * @return true if this event is cancelled
     */
    boolean isCancelled ();

    /**
     * Sets the cancellation state of this event. A cancelled event will not be executed in the server, but will still pass to other plugins.
     *
     * @param cancel true if you wish to cancel this event
     */
    void setCancelled (boolean cancel);
}
