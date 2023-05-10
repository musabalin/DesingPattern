package org.example.behavorial.null_object.loggers;

/**
 * @author musa.balin
 */
public class DatabaseLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Logged");
    }
}
