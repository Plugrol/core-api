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

package de.kissenpvp.api.config;

import de.kissenpvp.api.database.file.File;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class OptionDefault<T> implements Option<T>
{
    private T value;

    @Override public int getPriority()
    {
        return 0;
    }

    @Override public T getValue()
    {
        return value == null ? getDefault() : value;
    }

    @Override public void setValue(T value)
    {
        this.value = value;
    }

    @Override public void setUnsafe(Object value) throws ClassCastException
    {
        setValue((T) value);
    }

    @Override public void override(T value, File file)
    {
        setValue(value);
        file.write(getCode(), value, getDescription());
    }
}
