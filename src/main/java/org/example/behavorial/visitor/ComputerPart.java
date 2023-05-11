package org.example.behavorial.visitor;

/**
 * @author musa.balin
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}