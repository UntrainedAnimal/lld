package org.example.design_patterns.singleton;

public class StaticBlockInitialization {

    private static final StaticBlockInitialization INSTANCE;
    private StaticBlockInitialization(){}
    static{
        try {
            INSTANCE = new StaticBlockInitialization();
        }
        catch (Exception e){
            throw new RuntimeException("Exception");
        }
    }

    public static StaticBlockInitialization getInstance(){
        return INSTANCE;
    }
}

/*

Static block initialization implementation is similar to eager initialization,
except that instance of the class is created in the static block that provides the option for exception handling.
Both eager initialization and static block initialization create the instance even before it’s being used and that is not the best practice to use.
 */