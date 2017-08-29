package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Army armySoldier = new Army();
        Navy navySeal = new Navy();
        Marines marine = new Marines();

        System.out.println(armySoldier.speak());
        System.out.println(navySeal.roundhouse());
        System.out.println(marine.fluff());

        marine.example();


    }
}
