package org.example.behavorial.iterator;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new ConcreteCustomerRepository();
        Iterator iterator = customerRepository.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.getNext());
        }
    }
}
