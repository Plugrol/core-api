package de.kissenpvp.api.database;

import de.kissenpvp.api.database.connection.SQLImplementation;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface DatabaseImplementation extends SQLImplementation
{

    /**
     * Turns a {@link Record} to a json.
     *
     * @param record the record instance, with the parameter.
     * @return the json as string.
     */
    String toJson(Record record);

    /**
     * Turns a {@link String} back to a {@link Record}.
     *
     * @param <T>  the type of record, which is wanted.
     * @param json the code previously parsed in {@link #toJson(Record)}
     * @return the record created and with its parameter.
     */
    <T extends Record> T fromJson(String json, Class<T> record);

    <T extends Record> void addRecord(T entry, Meta meta, String id, String key);

    <T extends Record> void removeRecord(T entry, Meta meta, String id, String key);

}
