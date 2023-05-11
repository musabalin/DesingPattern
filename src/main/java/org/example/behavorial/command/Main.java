package org.example.behavorial.command;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {
        Coin xCoin = new Coin();

        xCoin.setName("Bitcoin");

        BuyCoinCommand buyCoinCommand = new BuyCoinCommand(xCoin);
        SellCoinCommand sellCoinCommand = new SellCoinCommand(xCoin);

        Broker broker= new Broker();

        broker.addCommandToQuery(buyCoinCommand);
        broker.addCommandToQuery(sellCoinCommand);
        broker.executeAll();

    }
}
