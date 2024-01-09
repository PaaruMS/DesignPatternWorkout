package org.patterns.factorySam;

public abstract class Computer {
    protected  int rateOfComputer;
    protected  int price= 5000;

    abstract int getRate();
    public int calculateTheProduct(){
        return price+getRate();
    }


}
