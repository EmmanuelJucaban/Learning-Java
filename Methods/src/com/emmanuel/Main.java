package com.emmanuel;

public class Main {

  // This method has the name of main
  // and all of the code inside it is the statements
  // that form the method
  public static void main(String[] args) {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;
    // write your code here
    calculateScore(gameOver, score, levelCompleted, bonus);

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    int calculateScoreInt = calculateScoreInt(gameOver, score, levelCompleted, bonus);

    System.out.println(calculateScoreInt);

  }

  // You cannot put a method within a method in Java
  // You should not put methods outside of the class block

  // Void means don't send any value back from a method
  // If we do want to return something, we want to return the type of the data back
  public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if(gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("Your final score was " + finalScore);
    }
  }

  // When we declare that a method should return something
  // We have to make sure that all cases are accounted for
  // This means that we have to return a value no matter what
  // And that the return inside the condition in this case is not returning a default value
  public static int calculateScoreInt(boolean gameOver, int score, int levelCompleted, int bonus) {

    if(gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      return finalScore;
    }
    return -1;
  }
}
