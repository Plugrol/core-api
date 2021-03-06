/*
 *  Copyright 14.07.2022 KissenPvP
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package de.kissenpvp.api.util;

import java.util.List;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface PageBuilder<T>
{

    /**
     * Get the values on one site, if the site is too big,
     * it'll return the content of the last page.
     * <p>
     * IMPORTANT The fist page is 1, not 0.
     *
     * @param currentPage The page whose values you want to have.
     * @return The values it contains.
     */
    List<T> getEntries(byte currentPage);

    /**
     * Get the maximum page you have.
     *
     * @return The maximum of pages available.
     */
    byte getLastPage();
}
