package org.example.structural.decarator.decorator;

import org.example.structural.decarator.models.Shape;

/**
 * @author musa.balin
 */
public class ShapeColorDecorator extends ShapeDecorator {
    public ShapeColorDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Shape'in rengi değiştirildi");
        super.draw();
    }
}
