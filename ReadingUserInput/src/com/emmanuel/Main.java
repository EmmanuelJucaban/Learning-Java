
package com.emmanuel;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
// write your code here.

    // System.in allows you to type input into the console
    // and return it back into the program.

    // Scanner is 1 of  Java's built in classes and it allows us to read user input
    // New creates a new instance of scanner
    // Creating a new object called scanner
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: ");

    // After finishing using the scanner, we should close it
    // with the close method.
    // Note that after closing the scanner
    // Calling methods like nextLine or nextInt will cause errors
    // Make sure we're done with the scanner once we use it

    // nextLine allows us to save a String
    String name = scanner.nextLine();

    // nextInt allows us to ask for an Int
    System.out.println("Enter year of birth: ");

    boolean hasNextInt = scanner.hasNextInt();

    int yearOfBirth = scanner.nextInt();
    int age = 2018 - yearOfBirth;

    System.out.println("Your name is " + name);
    System.out.println("Your age is " + age);
    // This releases the underlying memory that scanner was using internally
    scanner.close();
  }
}
