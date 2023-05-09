package org.example.structural.facade.services;

import org.example.structural.facade.facades.CrossCuttingConcernFacade;

/**
 * @author musa.balin
 */
public class ProductManager implements ProductService {
    private CrossCuttingConcernFacade crossCuttingConcernFacade;

    public ProductManager(CrossCuttingConcernFacade crossCuttingConcernFacade) {
        this.crossCuttingConcernFacade = crossCuttingConcernFacade;
    }

    @Override
    public void save() {
        crossCuttingConcernFacade.getCaching().cache();
        crossCuttingConcernFacade.getAuthorization().auth();
        crossCuttingConcernFacade.getLogging().log();
        System.out.println("Product save");
    }
}
