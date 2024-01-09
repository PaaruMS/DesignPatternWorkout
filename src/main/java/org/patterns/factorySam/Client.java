package org.patterns.factorySam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

   public static void main(String args[]) throws IOException {
       ComputerFactory factory= new ComputerFactory();
       BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the type of the computer ");
       String input1 = reader.readLine();
       Computer computer =factory.getComputer(input1);
       int rateOfComputer = computer.getRate();
       System.out.print("Rate of the computer "+input1 + "is " + rateOfComputer);
       System.out.println("Product calculation "+ computer.calculateTheProduct());
   }

}
