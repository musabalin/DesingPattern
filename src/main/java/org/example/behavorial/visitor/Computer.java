package org.example.behavorial.visitor;

/**
 * @author musa.balin
 */
public class Computer implements ComputerPart {
    ComputerPart[] computerParts;

    public Computer() {
        this.computerParts = new ComputerPart[]{new Keyboard(), new Monitor(), new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart cp : computerParts) {
            cp.accept(computerPartVisitor);
        }
    }
}
