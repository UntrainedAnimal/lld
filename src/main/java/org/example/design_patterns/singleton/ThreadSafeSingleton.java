package org.example.design_patterns.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }



/*

A simple way to create a thread-safe singleton class is to make the global access method synchronized so that only one thread can execute this method at a time.
The preceding implementation works fine and provides thread-safety, but it reduces the performance because of the cost associated with the synchronized method,
although we need it only for the first few threads that might create separate instances.



To avoid this extra overhead every time, double-checked locking principle is used.
In this approach, the synchronized block is used inside the if condition with an
additional check to ensure that only one instance of a singleton class is created.
The following code snippet provides the double-checked locking implementation:


 */
public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
    if (instance == null) {
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}

}