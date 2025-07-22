package org.example.design_patterns.state;

public class TrafficLightHandler {
    private static final TrafficLightHandler INSTANCE  = new TrafficLightHandler();

    public static TrafficLightHandler getInstance(){
        return INSTANCE;
    }

    private TrafficLightState trafficLightState;

    public TrafficLightHandler() {
        this.trafficLightState = new RedState();
    }
    public void setState(TrafficLightState trafficLightState){
        this.trafficLightState = trafficLightState;
    }
    public void doTask(){
        trafficLightState.perform();
    }
    public void next(){
        trafficLightState.next(INSTANCE);
    }

}
