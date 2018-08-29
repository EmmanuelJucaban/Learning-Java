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

    printMegaBytesAndKiloBytes(1);

    System.out.println(areEqualByThreeDecimalPlaces(-3.176, -3.176454364363));
    System.out.println(areEqualByThreeDecimalPlaces(3.175, -3.176));
  }

  // You cannot put a method within a method in Java
  // You should not put methods outside of the class block

  // Void means don't send any value back from a method
  // If we do want to return something, we want to return the type of the data back
  public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
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

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      return finalScore;
    }
    return -1;
  }

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes > 0) {
      int kiloBytesRemainder = kiloBytes % 1024;
      int megaBytes = kiloBytes / 1024;
      System.out.println(megaBytes);
      System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRemainder + " KB");

    }
    if (kiloBytes == 0) {
      System.out.println("0 KB = 0 MB and 0 KB");
    }
    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
    }
  }

  public static boolean isLeapYear(int year) {
    if ((year >= 1 && year <= 9999) || year < 0) {
      return false;
    }
    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      return true;
    }
    return false;
  }

  public static boolean areEqualByThreeDecimalPlaces(double one, double two){
    double testDouble1 = 1000 * one;
    System.out.println(testDouble1);
    double testDouble2 = 1000 * two;
    System.out.println(testDouble2);
    int testInt1 = (int) (1000 * one);
    System.out.println(testInt1);
    int testInt2 = (int) (1000 * one);
    System.out.println(testInt2);


    return (int)(one * 1000) == (int)(two * 1000);
  }

}
