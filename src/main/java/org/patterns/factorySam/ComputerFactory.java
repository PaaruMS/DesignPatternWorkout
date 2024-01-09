package org.patterns.factorySam;

public class ComputerFactory {
    public Computer getComputer(String typeOfComputer){
        if(typeOfComputer.equalsIgnoreCase("Laptop")){
            return new Laptop();
        } else if (typeOfComputer.equalsIgnoreCase("Server")) {
            return new Server();
        }else{
            return new Laptop();
        }
    }
}
