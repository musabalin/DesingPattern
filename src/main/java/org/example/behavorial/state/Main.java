package org.example.behavorial.state;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();


        StartState startState = new StartState();
        startState.doAction(context);

        if (startState.toString().equals("startState")) {
            System.out.println("Çalan Müzik: Sun goes down");
        }

        EndState endState = new EndState();
        System.out.println(endState.toString().toString());


    }
}
