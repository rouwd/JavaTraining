package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int numberCount = 1;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(numberCount <= 10){
            System.out.println("Enter number #" + numberCount + ":");
            boolean hasNextInteger = scanner.hasNextInt();

            if(hasNextInteger) {
	            int number = scanner.nextInt();
	            sum += number;
	            numberCount++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();

        }
        System.out.println("The sum of your numbers is " + sum);
	    scanner.close();
    }

}
