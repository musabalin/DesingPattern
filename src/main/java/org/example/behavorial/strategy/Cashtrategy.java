package org.example.behavorial.strategy;

public class Cashtrategy implements Strategy {

    @Override
    public boolean pay(double amount) {
        return false;
    }
}
