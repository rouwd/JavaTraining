package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int x = scanner.nextInt();
                if(x > max) {
                    max = x;
                }
                if(x < min) {
                    min = x;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min value: " + min + " max value: " + max);
        scanner.close();
    }

}
