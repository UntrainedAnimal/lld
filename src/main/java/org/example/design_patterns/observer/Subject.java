package org.example.design_patterns.observer;

public interface Subject {
    //register and unregister
    void register(Observer obj);
    void unregister(Observer obj);

    //notify observers
    void notifyObservers();

    //get update

    Object getUpdate();

}
