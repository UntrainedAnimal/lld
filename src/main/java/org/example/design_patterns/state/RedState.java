package org.example.design_patterns.state;

public class RedState implements TrafficLightState {
    @Override
    public void perform() {
        System.out.println("RED is glowing, STOP");
    }

    @Override
    public String getColor() {
        return Light.RED.name();
    }

    @Override
    public void next(TrafficLightHandler trafficLightHandler) {
        trafficLightHandler.setState(new GreenState());

    }
}
