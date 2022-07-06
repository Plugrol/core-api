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
