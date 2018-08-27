package com.emmanuel;

public class Main {

  public static void main(String[] args) {

    // Int has a width of 32 which is 4 bytes
    int myIntVal = 5 / 2;
    // We usually put an "f" in front of a float
    // To signify that it's a float


    // Float has a width of 32 = 4 bytes
    float myFloatVal = 5f / 3f ;
    // Java will automatically assume that a number with a decimal point is a double

    // Has a width of 64 which is 8 bytes
    double myDoubleValue = 5d / 3d;

    // By default, if using ints, Java will not take into account the remainders
    // of an operation. This will equal into the number being rounded down.
    System.out.println("myIntval " + myIntVal);
    System.out.println("myIntval " + myFloatVal);
    System.out.println("myIntval " + myDoubleValue);
  }
}
