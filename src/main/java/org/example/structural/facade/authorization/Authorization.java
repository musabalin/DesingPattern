package org.example.structural.facade.authorization;

/**
 * @author musa.balin
 */
public class Authorization implements IAuthorization {
    @Override
    public void auth() {
        System.out.println("Authorization");
    }
}
