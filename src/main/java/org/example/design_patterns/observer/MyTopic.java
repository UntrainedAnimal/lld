package org.example.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyTopic implements Subject{

    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if(Objects.isNull(obj)){
            throw new NullPointerException("NUll observer");
        }
        synchronized (MUTEX){
            if(!observers.contains(obj)){
                observers.add(obj);
            }
        }

    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX){
            if(observers.contains(obj)){
                observers.remove(obj);
            }
        }
    }

    @Override
    public void notifyObservers() {
        synchronized (MUTEX){
            if(!changed){
                return;
            }
            this.observers.stream().forEach(x->x.update());
            this.changed=false;
        }
    }

    @Override
    public Object getUpdate() {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message posted to topic "+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }
}
