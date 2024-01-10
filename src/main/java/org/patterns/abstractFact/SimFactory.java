package org.patterns.abstractFact;

public class SimFactory {
    public static  Sim getSimInstance(SimAbstractFactory simAbstractFactory){
        return simAbstractFactory.createInstance();
    }
}
