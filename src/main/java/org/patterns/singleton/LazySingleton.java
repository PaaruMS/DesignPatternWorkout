package org.patterns.singleton;

public class LazySingleton {

    private static LazySingleton lazySingleton= null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
       if(lazySingleton ==null){
           lazySingleton= new LazySingleton();
           return lazySingleton;
       }
       return lazySingleton;
    }
    public static void main(String args[]){
        LazySingleton obj = getInstance();
        LazySingleton obj1 = getInstance();
        System.out.print(obj);
        System.out.print(obj1);

    }
}
