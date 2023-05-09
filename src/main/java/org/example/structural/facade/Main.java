package org.example.structural.facade;

import org.example.structural.facade.authorization.Authorization;
import org.example.structural.facade.caching.Caching;
import org.example.structural.facade.facades.CrossCuttingConcernFacade;
import org.example.structural.facade.logging.Logging;
import org.example.structural.facade.services.ProductManager;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {

        CrossCuttingConcernFacade crossCuttingConcernFacade = new CrossCuttingConcernFacade(new Caching(), new Authorization(), new Logging());

        ProductManager productManager = new ProductManager(crossCuttingConcernFacade);
        productManager.save();
    }
}
