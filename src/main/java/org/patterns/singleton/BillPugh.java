package org.patterns.singleton;

public class BillPugh {
    private static BillPugh billObj = null;

    private BillPugh(){

    }

    private static class InnerBillPugh{
        private static final InnerBillPugh innerBillPugh = new InnerBillPugh();
    }
    public static InnerBillPugh getInstance(){

        return InnerBillPugh.innerBillPugh;
    }


    public  static void main(String args[]){
        InnerBillPugh obj =getInstance();
        InnerBillPugh obj1 =getInstance();
        System.out.print(obj);
        System.out.print(obj1);
    }
}
