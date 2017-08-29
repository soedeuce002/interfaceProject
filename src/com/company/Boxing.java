package com.company;

public interface Boxing {

    String uppercut();

    String jab();

    default void example(){
        System.out.println("This line proves that a default method can be set up in an interface and " +
                "called on in main without any problems");
    }


}
