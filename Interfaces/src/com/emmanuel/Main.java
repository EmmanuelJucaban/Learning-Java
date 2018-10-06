package com.emmanuel;

public class Main {

  public static void main(String[] args) {
    // write your code here
    // This works as well but we have to make sure that we use a constructor that has implemented the ITelephone interface
    ITelephone timsPhone;
    // We could've also done this
    // DeskPhone timsPhone

    timsPhone = new DeskPhone(123456);
    timsPhone.powerOn();
    timsPhone.dial(123456);
    timsPhone.callPhone(123456);
  }
}
