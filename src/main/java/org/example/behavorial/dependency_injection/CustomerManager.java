package org.example.behavorial.dependency_injection;

/**
 * @author musa.balin
 */
public class CustomerManager implements CustomerService{
    @Override
    public void save() {
        System.out.println("Customer saved.");
    }
}
