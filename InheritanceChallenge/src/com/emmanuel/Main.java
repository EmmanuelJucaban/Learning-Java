package com.emmanuel;

public class Main {

  public static void main(String[] args) {
//    // write your code here
//    Car mazda = new Car("Mazda", "small", 4, 4, 6, true);
//    mazda.changeVelocity(1,2);
//    mazda.stop();
//
//    Outlander outlander = new Outlander(26);


    Dimensions dimensions = new Dimensions(5, 5, 5);
    Case theCase = new Case("NZXT", "NZXT", "12v", dimensions);


    Monitor monitor = new Monitor("Asus", "Asus", 24, new Resolution(24, 24));
    Motherboard motherboard = new Motherboard("Razer", "Razer", 6, 2, "No idea");

    PC pc = new PC(theCase, monitor, motherboard);

    // We need to get the case here which is the object that has access to the power button
    pc.powerUp();
  }
}
