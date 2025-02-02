package org.example.design_patterns.factory;

public class FactoryClient {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "5GB", "15GB", "2.4GHZ");
        Computer server = ComputerFactory.getComputer("SERVER", "64GB", "15TB", "5GHZ");

        System.out.println("pc specs are "+pc);
        System.out.println("server specs are "+server);


    }
}
