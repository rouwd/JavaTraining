package com.company;

public class Main {

    public static void main(String[] args) {
	    double pounds = 100d;
	    double poundsToKilograms = 0.45359237d;
	    double kilograms = pounds * poundsToKilograms;

        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_89;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
