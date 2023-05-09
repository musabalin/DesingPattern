package org.example.structural.facade.logging;

/**
 * @author musa.balin
 */
public class Logging implements ILogging {
    @Override
    public void log() {
        System.out.println("Logged");
    }
}
