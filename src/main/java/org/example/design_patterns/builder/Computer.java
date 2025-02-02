package org.example.design_patterns.builder;

import lombok.Builder;
import lombok.Getter;


@Getter
public class Computer {
    //required parameter
    private String HDD;
    private String RAM;

    //optional parameter
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }


    //Builder

    public static class ComputerBuilder{
        //required parameter
        private String HDD;
        private String RAM;

        //optional parameter
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;


        public ComputerBuilder(String hdd,String ram){
            this.HDD=hdd;
            this.RAM=ram;
        }
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled=isGraphicsCardEnabled;
            return this;
        }
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled=isBluetoothEnabled;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
