package de.kissenpvp.api.database.file;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.List;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface File
{
    JsonObject readJSON() throws IOException;

    void writeJSON(JsonObject json) throws IOException;

    /**
     * This method adds text to the end of the file.
     *
     * @param text The text to be added.
     */
    void write(String text);

    /**
     * This method writes a line of text in a specific line.
     *
     * @param text The text to be written.
     * @param line The line, where the text should be.
     */
    void write(String text, int line);

    /**
     * Write a value on a key.
     * To remove it, just set the value to null.
     *
     * @param key   The key, the value.
     * @param value the value that is hidden behind the key.
     */
    void write(String key, Object value, String... comments);

    /**
     * Empty the file.
     */
    void clear();

    /**
     * Get all the lines in the file as a list
     *
     * @return The lines as a list.
     */
    List<String> read();

    /**
     * Get the text of a certain line.
     *
     * @param line The line whose text is to be returned.
     * @return The text of the given line.
     */
    String read(int line);

    /**
     * Read the contents of a specific key.
     *
     * @param key the key whose content is to be read.
     * @return The content of the key.
     */
    String read(String key);

    /**
     * This method returns a list.
     *
     * @param key The key behind which the list is.
     * @return The list.
     */
    List<String> readList(String key);

    /**
     * Get the file as a Java file
     *
     * @return The file as java file.
     */
    java.io.File getJavaFile();
}
