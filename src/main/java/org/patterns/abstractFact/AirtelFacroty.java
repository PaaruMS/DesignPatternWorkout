package org.patterns.abstractFact;

public class AirtelFacroty implements SimAbstractFactory{
    @Override
    public Sim createInstance() {
        return new Airtel();
    }
}
