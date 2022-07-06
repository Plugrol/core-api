package de.kissenpvp.api.database.savable;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface DataRecordList<T extends Record> extends DataList
{
    boolean add(T s);

    void add(int index, T element) throws DuplicateException;

    boolean addAllRecord(Collection<T> c);

    boolean addAllRecord(int index, Collection<T> c);

    boolean remove(T o);

    boolean removeAllRecord(Collection<T> c);

    boolean removeIfRecord(Predicate<? super T> filter);

    boolean contains(T record);

    List<T> toRecordList();
}
