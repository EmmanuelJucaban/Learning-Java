package com.emmanuel;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Car mazda = new Car("Mazda", "small", 4, 4, 6, true);
    mazda.changeVelocity(1,2);
    mazda.stop();

    Outlander outlander = new Outlander(26);
  }
}
