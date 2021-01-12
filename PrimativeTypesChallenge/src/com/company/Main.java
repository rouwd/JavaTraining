package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByte = 100;
        short myShort = 1000;
        int myInt = 10000;
        long myLong = 50000L + 10L * ( myByte + myShort + myInt );
        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println(shortTotal);
    }
}
