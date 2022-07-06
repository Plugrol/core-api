package de.kissenpvp.api.database.savable;

import de.kissenpvp.api.database.ObjectMeta;

import java.util.Map;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Savable
{

    ObjectMeta getDestinationMeta();

    String getSaveID();

    String getRawID();

    default String getID()
    {
        return getSaveID() + getRawID();
    }

    void setup();

    Map<String, Object> getStorage();

    SavableMap getMeta();

}
