package org.example.behavorial.mediator;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {
        Plane plane1 = new Plane("A1B1");
        Plane plane2 = new Plane("A2B1");
        Plane plane3 = new Plane("A3B1");
        Plane plane4 = new Plane("A4B1");

        plane1.requestLanding();
        plane2.requestLanding();
        plane3.requestLanding();
    }
}
