package org.example.behavorial.state;

/**
 * @author musa.balin
 */
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Medya çalar başlatılıyor");
    }

    @Override
    public String toString() {
        return "startState";
    }
}
