package org.example.behavorial.dependency_injection.loggers;

/**
 * @author musa.balin
 */
public class DatabaseLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Logged");
    }
}
