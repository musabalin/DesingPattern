package org.example.behavorial.visitor;

/**
 * @author musa.balin
 */
public interface ComputerPartVisitor {
    void visit(Monitor monitor);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Computer computer);
}
