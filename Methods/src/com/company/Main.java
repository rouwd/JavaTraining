package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 5, 100);
        System.out.println("Your final score was " + highScore);

        score = 20000;
        levelCompleted = 10;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Player1",position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Player2",position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Player3",position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Player4",position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Player5",position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Player6",position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Player7",position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4;

        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
