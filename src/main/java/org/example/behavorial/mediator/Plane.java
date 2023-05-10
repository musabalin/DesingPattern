package org.example.behavorial.mediator;

/**
 * @author musa.balin
 */
public class Plane {
    private String flightCode;

    public void requestLanding() {
        Airport.landingRequest(this);
    }

    public void requestDeparture() {
        System.out.println(this.flightCode);
        Airport.departureRequest(this);
    }

    public Plane(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }
}
