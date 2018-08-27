package com.emmanuel;

public class Main {

  public static void main(String[] args) {
    // write your code here


    // Int has a width of 32
    // This is 2 to the power of 31
    int minIntValue= -2_147_483_648;
    int maxIntValue = 2_147_483_647;
    int intTotalVal = minIntValue + maxIntValue;

    System.out.println(intTotalVal);
    // Can only store smaller numbers.
    // bye has a width of 8
    // This is 2 to the power of 7
    byte minByteValue = -128;
    byte maxByteValue = 127;

    // This is called 'casting'.
    // By default Java will automatically convert numbers into int
    // We can override that by doing this type of syntax
    byte byteTotalVal = (byte) (minByteValue + maxByteValue);
    System.out.println("Byte is");
    System.out.println(byteTotalVal);



    // short has a width of 16
    // This is 2 to the power of 15
    // Can store a larger number than byte
    // A short is allocated around twice the amount of space
    // than a byte is
    // And about a half amount an Int is.
    short myShortValue = -32768;
    short maxShortValue = 32767;

    // long has a width of 64
    // We normally put an "L" at the end of a long to signify that it's a long
    // This is 2 to the power of 63
    long minLongValue = -9_223_372_036_854_775_808L;
    long maxLongValue = 9_223_372_036_854_775_807L;


    // Challenge mode

    byte myByte = 10;
    short myShort = 20;
    int myInt = 50;
    long myLong = (long) (50_000 + 10 * (myByte + myShort + myInt));
    System.out.println("Long total " + myLong);
  }
}
