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
