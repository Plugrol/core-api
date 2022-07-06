package de.kissenpvp.api.base.loader;

import java.util.List;
import java.util.Set;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ClassScanner
{
    
    Set<ScanEntry> getPaths();

    <T> List<T> getList(Class<T> clazz);
}
