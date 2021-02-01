package com.company;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Dan", 500);
        System.out.println("New score is " + newScore);

        int secondScore = calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(5,9));
        System.out.println(calcFeetAndInchesToCentimeters(69));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches> 12) {
            return -1;
        }
        return (feet * 12 + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = Math.floor(inches / 12.0);
        double remainderInches = inches % 12.0;
//        System.out.println(feet + " Feet " + remainderInches + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainderInches);
    }
}
