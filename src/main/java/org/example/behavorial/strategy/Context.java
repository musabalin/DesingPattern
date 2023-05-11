package org.example.behavorial.strategy;

/**
 * @author musa.balin
 */
public class Context {
    public Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public boolean executePayment(double amount) {
        return this.strategy.pay(amount);
    }
}
