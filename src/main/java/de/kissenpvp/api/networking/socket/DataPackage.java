package de.kissenpvp.api.networking.socket;

import java.util.List;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface DataPackage extends List<Object>
{
    /**
     * The ID or the execution command.
     *
     * @return The id of the data packet.
     */
    String getID();

    String getSender();

    String getGroup();

    boolean isReply();

    void setReply(boolean reply);

    /**
     * Executed by clients to indicate who the message is coming from.
     * If the package is not signed, the server will refuse the answer.
     *
     * @param sender The sender of the package.
     * @param group  The related group.
     */
    void sign(String sender, String group);
}
