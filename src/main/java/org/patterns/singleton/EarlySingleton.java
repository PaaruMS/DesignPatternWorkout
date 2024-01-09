package org.patterns.singleton;

public class EarlySingleton {
    private static EarlySingleton earlySingleton= new EarlySingleton();

    private EarlySingleton(){}

    public static EarlySingleton getInstance(){
        return earlySingleton;
    }
    public static void main(String args[]){
        EarlySingleton obj = getInstance();
        EarlySingleton obj1 = getInstance();
        System.out.print(obj);
        System.out.print(obj1);

    }}
