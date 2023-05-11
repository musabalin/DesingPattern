package org.example.behavorial.strategy;

public class CreditCardStrategy implements Strategy {

    @Override
    public boolean pay(double amount) {
        return false;
    }
}
