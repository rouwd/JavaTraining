package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(1));
        System.out.println(isEvenNumber(2));

        int number = 4;
        int end = 20;
        int count = 0;

        while(number <= end) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            count++;
            if (count == 5) {
                break;
            }
        }

        System.out.println("Found " + count + " even numbers");
    }

    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }
}
