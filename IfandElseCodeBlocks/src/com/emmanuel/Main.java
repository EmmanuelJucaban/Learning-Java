package com.emmanuel;

public class Main {

  public static void main(String[] args) {
  // write your code here
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    if (gameOver) {
      int finalScore = score + (levelCompleted + bonus);
      System.out.println("Your final score was " + finalScore);
    }

    // This will throw an error
    // Java variables are blocked scope
    // They will not leak outside of the block they're in
    int savedFinalScore = finalScore;
  }
}
