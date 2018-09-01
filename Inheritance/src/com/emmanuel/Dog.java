package com.emmanuel;


public class Dog extends Animal {

  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;


  public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
    super(name, 1, 1, size, weight);
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;
  }


  public void chew(){
    System.out.println("Dog.chew() is called");
  }

  @Override
  public void eat(){
    System.out.println("Dog.eat() called");
    super.eat();
    chew();
  }

  public void walk(){
    super.move(3);
  }

  public void run(){
    move(12);
  }


  private void moveLegs(int speed) {
    System.out.println("Animal.move()is called moving at " + speed + " speed");
  }

  @Override
  public void move(int speed) {
    System.out.println("Dog.move() called");
    moveLegs(speed);
    super.move(speed);
  }
}
