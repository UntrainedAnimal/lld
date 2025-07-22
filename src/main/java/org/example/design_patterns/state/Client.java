package org.example.design_patterns.state;

public class Client {
    public static void main(String[] args) {
        TrafficLightHandler trafficLightHandler = TrafficLightHandler.getInstance();

        for(int i=0;i<20;i++){
            trafficLightHandler.doTask();
            trafficLightHandler.next();
        }
    }
}
