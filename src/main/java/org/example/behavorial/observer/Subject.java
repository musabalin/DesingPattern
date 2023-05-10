package org.example.behavorial.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author musa.balin
 */
public class Subject {
    private int number;
    private List<Observer> subscriber = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        this.notifyAllSubscriber();
    }

    public void subscribe(Observer observer) {
        this.subscriber.add(observer);
    }

    public void notifyAllSubscriber() {
        for (Observer observer : subscriber) {
            observer.update();
        }
    }
}
