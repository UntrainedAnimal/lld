package org.example.design_patterns.builder;

public class BuilderClient {


    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500","2")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
    }
}
