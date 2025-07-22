package org.example.design_patterns.state;

public class GreenState implements TrafficLightState{


    @Override
    public void perform() {
        System.out.println("Green is glowing, go go go go");
    }

    @Override
    public String getColor() {
        return Light.GREEN.name();
    }

    @Override
    public void next(TrafficLightHandler trafficLightHandler) {
        trafficLightHandler.setState(new YellowState());
    }
}
