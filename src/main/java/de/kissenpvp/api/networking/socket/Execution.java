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

package de.kissenpvp.api.networking.socket;


import java.net.Socket;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Execution
{

    /**
     * Is called when the specified ID is sent and the given code is executed.
     *
     * @param dataPackage The packet that is sent as {@link DataPackage}.
     * @param client      The client that sent the package.
     */
    void execute(DataPackage dataPackage, Socket client);

}
