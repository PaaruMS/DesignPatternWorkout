package org.patterns.abstractFact;

public class JioFactory implements SimAbstractFactory{
    @Override
    public Sim createInstance() {
        return new Jio();
    }
}
