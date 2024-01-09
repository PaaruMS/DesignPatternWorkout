package org.patterns.singleton;

public class SynchronizedSinglton {
    private static SynchronizedSinglton obj;
    private SynchronizedSinglton(){

    }

    public static synchronized SynchronizedSinglton getInstance(){
        if(obj==null){
            obj=new SynchronizedSinglton();
            return obj;

        }
        return obj;
    }

    public  static void main(String args[]){
        SynchronizedSinglton synOnj= getInstance();
        System.out.print(synOnj);
    }
}
