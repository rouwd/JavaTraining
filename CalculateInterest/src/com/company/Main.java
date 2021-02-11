package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i=2; i<=8; i++) {
            System.out.println(i + "% interest on 10,000 = " + calculateInterest(10000.0,i));
        }
        for (int i=8; i>=2; i--) {
            System.out.println(i + "% interest on 10,000 = " + calculateInterest(10000.0,i));
        }

        int primeCount = 0;
        for (int i=100; i<1000; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is prime");
                primeCount++;
                if(primeCount == 3){
                    break;
                }
            }
        }

        primeCount = 0;
        int currentNumber = 20;
        while (primeCount < 3) {
            if(isPrime(currentNumber)) {
                System.out.println(currentNumber + " is prime");
                primeCount++;
            }
            currentNumber++;
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
        for (int i=2; i<= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
