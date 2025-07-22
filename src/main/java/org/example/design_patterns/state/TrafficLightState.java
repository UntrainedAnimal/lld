package org.example.design_patterns.state;

public interface TrafficLightState {
    void perform();
    String getColor();
    void next(TrafficLightHandler trafficLightHandler);

}
