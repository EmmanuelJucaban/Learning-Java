package com.emmanuel;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
// write your code here
    Scanner scanner = new Scanner(System.in);

    int min = 0;
    int max = 0;
    boolean first = true;

    while (true) {

      System.out.println("Enter a number: ");

      boolean isAnInt = scanner.hasNextInt();

      if (isAnInt){

        int number = scanner.nextInt();

        if(first) {
          first = false;
          min = number;
          max = number;
        }

        if(min < number ) {
          min = number;
        }

        if(max < number ) {
          max = number;
        }
      } else {
        break;
      }
    }
  }
}
