package org.example.behavorial.state;

/**
 * @author musa.balin
 */
public class EndState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Medya çalar sonlandırılıyor");


    }

    @Override
    public String toString() {
        return "EndState";
    }
}
