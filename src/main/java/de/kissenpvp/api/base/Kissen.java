package de.kissenpvp.api.base;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Kissen
{
    InfoNode getInternals();

    void start(InfoNode infoNode) throws KissenStartException;

    <T extends Implementation> T getImplementation(Class<T> implementation);
}
