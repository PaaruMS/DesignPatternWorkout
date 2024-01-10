package org.patterns.abstractFact;

public class ClientSim {
    public static void main(String args[])throws Exception{
        Sim sim= SimFactory.getSimInstance(new JioFactory());
        Sim sim1= SimFactory.getSimInstance(new AirtelFacroty());
    System.out.println(sim.packageRate(2));
    System.out.println(sim1.packageRate(4));

    }
}
