package org.example.structural.decarator.decorator;

import org.example.structural.decarator.models.Shape;

/**
 * @author musa.balin
 */
public abstract class ShapeDecorator implements Shape {

    public Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    @Override
    public void draw() {
        shape.draw();
    }
}
