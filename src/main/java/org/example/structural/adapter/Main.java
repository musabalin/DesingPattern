package org.example.structural.adapter;

import org.example.structural.adapter.adapters.XSMSAdapter;
import org.example.structural.adapter.adapters.YSMSAdapter;
import org.example.structural.adapter.services.CustomerManager;
import org.example.structural.adapter.services.CustomerService;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerManager(new YSMSAdapter());
        customerService.register();
    }
}
