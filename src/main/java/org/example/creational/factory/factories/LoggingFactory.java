package org.example.creational.factory.factories;

import org.example.creational.factory.logging.DatabaseLogging;
import org.example.creational.factory.logging.FileLogging;
import org.example.creational.singleton.ILogging;

/**
 * @author musa.balin
 */
public class LoggingFactory {
    public ILogging createLogger() {
        return new FileLogging();
    }
}
