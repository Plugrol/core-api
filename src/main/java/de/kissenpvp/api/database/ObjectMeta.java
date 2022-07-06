package de.kissenpvp.api.database;

import de.kissenpvp.api.database.savable.Savable;
import de.kissenpvp.api.database.savable.SavableMap;

import java.util.Map;

/**
 * Can store objects using a map to store attributes.
 *
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ObjectMeta extends Meta
{

    /**
     * Add an object to the meta.
     *
     * @param id   The identifier of the object.
     * @param data This list contains all data that are transferred to the object.
     */
    void add(String id, Map<String, String> data, String... plugin);

    /**
     * Delete an object from the meta.
     *
     * @param totalId The ID of the object.
     */
    void remove(String totalId);

    /**
     * This method returns the data of an object.
     *
     * @param totalId The id of the object.
     * @return The content, that is saved.
     */
    Map<String, String> getData(String totalId);

    /**
     * Reads all the data from a special {@link Savable}, which are objects stored in the database.
     *
     * @param savable the savable to search for.
     * @param <T>     the type of the savable which should be returned.
     * @return a savable map created on this context.
     */
    <T extends Savable> Map<String, SavableMap> getData(Class<T> savable);

    /**
     * Add the data from this map to the database.
     *
     * @param DATA    The data which one should be saved.
     * @param totalId sets the whole data entry to the map.
     */
    void setData(String totalId, Map<String, String> DATA);

}
