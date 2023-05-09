package org.example.structural.facade.facades;

import org.example.structural.facade.authorization.IAuthorization;
import org.example.structural.facade.caching.ICaching;
import org.example.structural.facade.logging.ILogging;

/**
 * @author musa.balin
 */
public class CrossCuttingConcernFacade {
    private ICaching caching;
    private IAuthorization authorization;
    private ILogging logging;

    public CrossCuttingConcernFacade(ICaching caching, IAuthorization authorization, ILogging logging) {
        this.caching = caching;
        this.authorization = authorization;
        this.logging = logging;
    }

    public ICaching getCaching() {
        return caching;
    }

    public IAuthorization getAuthorization() {
        return authorization;
    }

    public ILogging getLogging() {
        return logging;
    }
}
