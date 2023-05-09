package org.example.creational.builder.models;

/**
 * @author musa.balin
 */
public class Car {
    public int seats;
    public double fuel;
    public String modelName;
    public double enginePower;

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", fuel=" + fuel +
                ", modelName='" + modelName + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}
