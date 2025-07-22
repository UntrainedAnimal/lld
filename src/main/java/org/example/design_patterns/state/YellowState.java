package org.example.design_patterns.state;

public class YellowState implements TrafficLightState{
    @Override
    public void perform() {
        System.out.println("Yellow is glowing, hold on");
    }

    @Override
    public String getColor() {
        return Light.YELLOW.name();
    }

    @Override
    public void next(TrafficLightHandler trafficLightHandler) {
        trafficLightHandler.setState(new RedState());
    }
}
