package com.emmanuel;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Animal animal = new Animal("Animal", 1, 2, 2, 2);

    Dog oscar = new Dog("Oscar", 510, 155, 2, 2, 1,23, "Lemur");

    oscar.eat();
    oscar.walk();
    oscar.run();
  }
}
