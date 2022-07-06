package de.kissenpvp.api.database.savable;

import java.io.Serializable;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ListAction
{
    void execute(ListExecution listExecution, Object... values);

    enum ListExecution implements Serializable
    {
        SET,
        ADD,
        ADD_INDEX,
        ADD_ALL,
        ADD_ALL_INDEX_INCLUDED,
        REMOVE,
        REMOVE_INDEX,
        REMOVE_ALL,
        REMOVE_RANGE,
        REMOVE_IF,
        RETAIN_ALL,
        REPLACE_ALL,
        REPLACE,
        CLEAR,
        UNDEFINED
    }
}
