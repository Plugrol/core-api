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

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public enum InternalProtocols
{

    LOGIN("_INTERNAL_LOGIN_"),
    DISCONNECT("_INTERNAL_DISCONNECT_"),
    PING("_INTERNAL_PING_"),
    CHECK("_INTERNAL_CHECK_"),
    RESPONSE("_INTERNAL_RESPONSE_"),
    INVALID("_INTERNAL_INVALID_");

    private final String PROTOCOL_NAME;

    /**
     * Assigns a protocol id, which is sent internally in order to communicate.
     *
     * @param PROTOCOL_NAME The id of the protocol that'll be sent.
     */
    InternalProtocols(String PROTOCOL_NAME)
    {
        this.PROTOCOL_NAME = PROTOCOL_NAME;
    }

    public String getProtocolName()
    {
        return PROTOCOL_NAME;
    }
}
