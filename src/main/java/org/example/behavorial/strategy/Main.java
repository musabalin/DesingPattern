package org.example.behavorial.strategy;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Cashtrategy());

        System.out.println(context.executePayment(500));

        context.strategy = new CreditCardStrategy();
        System.out.println(context.executePayment(500));
    }
}
