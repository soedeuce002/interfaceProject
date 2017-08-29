package com.company;

public abstract class Soldiers implements Pillow {
    private String name;
    private int rank;
    private int serialNumber;

    public String sleep() {
        return "snore";
    }

    public String eat() {
        return "chew";
    }

    public String walk() {
        return "trudge";
    }

    abstract String speak();

    public String swing(){
        return "Swoosh";
    }

    public String fluff() {
        return "OMG! Who's cleaning up all these feathers?!?";
    }

    public String roundhouse(){
        return "HIYAAA!";
    }

    public String sweep(){
        return "You have to stay on your toes!!";
    }

    public String uppercut() {
        return "KaBLOOOOIE!!";
    }
    public String jab() {
        return "KaPOW!!";
    }



}
