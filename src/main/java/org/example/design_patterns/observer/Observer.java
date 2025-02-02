package org.example.design_patterns.observer;

public interface Observer {

    //attach to an subject
    void setSubject(Subject sub);

    // update the observer used by subject

    void update();
}
