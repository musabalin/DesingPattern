package org.example.behavorial.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author musa.balin
 */
public class Airport {

    private static List<Plane> landingPlanes = new ArrayList<>();
    private static List<Plane> departurePlanes = new ArrayList<>();

    public static void landingRequest(Plane plane) {
        landingPlanes.add(plane);
        System.out.println(plane.getFlightCode() + " Nolu Uçak İniş isteğiniz sıraya alındı " + landingPlanes.size());

    }

    public static void departureRequest(Plane plane) {
        departurePlanes.add(plane);
        System.out.println(plane.getFlightCode() + " Nolu Uçak Kalkış isteğiniz sıraya alındı");
    }
}
