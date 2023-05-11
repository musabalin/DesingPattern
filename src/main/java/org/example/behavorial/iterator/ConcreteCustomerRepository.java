package org.example.behavorial.iterator;

/**
 * @author musa.balin
 */
public class ConcreteCustomerRepository implements CustomerRepository {
    public String customers[] = {"Musa", "Ali", "Veli"};

    @Override
    public Iterator getIterator() {
        return new CustomerIterator(customers);
    }
}
