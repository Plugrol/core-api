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
