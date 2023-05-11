package org.example.behavorial.template;

/**
 * @author musa.balin
 */
public class Golf extends Game{
    @Override
    void initialize() {
        System.out.println("Golf initialized");
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
