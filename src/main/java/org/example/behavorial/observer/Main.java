package org.example.behavorial.observer;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryConverter binaryConverter= new BinaryConverter(subject);
        OctalConverter octalConverter = new OctalConverter(subject);
        HexaConverter hexaConverter = new HexaConverter(subject);

        subject.setNumber(5);
        System.out.println("****************");
        subject.setNumber(10);

    }
}
