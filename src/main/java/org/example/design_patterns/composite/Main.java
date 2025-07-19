package org.example.design_patterns.composite;

public class Main {
    public static void main(String[] args) {
        Component hdd       = new Leaf("hdd" , 4000d);
        Component keyboard  = new Leaf("keyboard",1000d);
        Component mouse     = new Leaf("mouse",500d);
        Component ram       = new Leaf("ram",3000d);
        Component processor = new Leaf("Processor",10000d);


        Composite computer = new Composite("computer");

        Composite motherboard = new Composite("motherboard");
        motherboard.addComponent(ram);
        motherboard.addComponent(processor);


        Composite cabinet  = new Composite("cabinet");
        cabinet.addComponent(hdd);
        cabinet.addComponent(motherboard);

        Composite peripherals     = new Composite("peripherals");
        peripherals.addComponent(keyboard);
        peripherals.addComponent(mouse);

        computer.addComponent(cabinet);
        computer.addComponent(peripherals);

        computer.showPrice();
    }
}
