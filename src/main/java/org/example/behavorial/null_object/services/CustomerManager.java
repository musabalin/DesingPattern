package org.example.behavorial.null_object.services;

import org.example.behavorial.null_object.loggers.ILogger;

/**
 * @author musa.balin
 */
public class CustomerManager implements CustomerService {

    private ILogger logger;

    public CustomerManager(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void add() {
        logger.log();
        System.out.println("Eklendi");

    }
}
