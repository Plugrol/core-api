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

package de.kissenpvp.api.networking;

import de.kissenpvp.api.base.Implementation;
import de.kissenpvp.api.networking.socket.DataPackage;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Network extends Implementation
{

    DataPackage createPackage(String id, Object... data);

    void sendDataPackage(DataPackage dataPackage);

}