package org.example.design_patterns.factory;


public class ComputerFactory {

    public static Computer getComputer(String type,String ram,String hdd,String cpu){
        return switch (type) {
            case ("PC") -> new PC(ram, hdd, cpu);
            case ("SERVER") -> new Server(ram, hdd, cpu);
            default -> null;
        };
    }
}
