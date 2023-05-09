package org.example.structural.facade.caching;

/**
 * @author musa.balin
 */
public class Caching implements ICaching {
    @Override
    public void cache() {
        System.out.println("Caching");
    }
}
