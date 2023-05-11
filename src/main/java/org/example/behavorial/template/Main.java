package org.example.behavorial.template;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {
        Game football = new Football();
        Game golf = new Golf();

        football.play();
        golf.play();
    }
}
