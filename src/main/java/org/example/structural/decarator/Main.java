package org.example.structural.decarator;

import org.example.structural.decarator.decorator.ShapeColorDecorator;
import org.example.structural.decarator.models.Circle;
import org.example.structural.decarator.models.Rectangle;
import org.example.structural.decarator.models.Shape;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Shape decoratorRectangle = new ShapeColorDecorator(new Rectangle());
        decoratorRectangle.draw();

    }
}
