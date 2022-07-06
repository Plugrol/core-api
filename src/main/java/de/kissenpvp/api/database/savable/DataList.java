package de.kissenpvp.api.database.savable;

import de.kissenpvp.api.database.ObjectMeta;
import de.kissenpvp.api.util.KissenList;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface DataList extends KissenList<String>
{

    /**
     * Turn this list into a record list.
     *
     * @param record type of record this is about.
     * @param <T>    The type of record list to return.
     * @return A list of records.
     */
    <T extends Record> DataRecordList<T> toRecordList(Class<T> record);

    boolean isStore();

    /**
     * @param store Whether the data should be written to the database imminently.
     */
    void setStore(boolean store);

    String getID();

    String getKey();

    ObjectMeta getMeta();

}
