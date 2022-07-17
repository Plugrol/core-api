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
