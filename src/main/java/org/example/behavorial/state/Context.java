package org.example.behavorial.state;

/**
 * @author musa.balin
 */
public class Context {
    private State state;

    public Context() {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
