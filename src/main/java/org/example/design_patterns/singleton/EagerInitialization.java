package org.example.design_patterns.singleton;

public class EagerInitialization {
    public static final EagerInitialization INSTANCE = new EagerInitialization();

    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
        return INSTANCE;
    }
}

/*

If your singleton class is not using a lot of resources, this is the approach to use.
But in most of the scenarios, singleton classes are created for resources such as File System, Database connections, etc.
We should avoid the instantiation unless the client calls the getInstance method. Also, this method doesn’t provide any options for exception handling.

 */