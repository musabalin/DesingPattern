package org.example.behavorial.template;

/**
 * @author musa.balin
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football initialized");
    }

    @Override
    void start() {
        System.out.println("Start");
    }

    @Override
    void end() {
        System.out.println("End");
    }
}
