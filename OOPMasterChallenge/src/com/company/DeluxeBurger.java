package com.company;

public class DeluxeBurger extends Hamburger {

  public DeluxeBurger(String meat, String breadRollType, String chipsAddition, double chipsPrice, String drinkAddition, double drinkPrice){
    super("Deluxe burger", meat, breadRollType);
    super.addHamburgerAddition1("Drinks", .50);
    super.addHamburgerAddition2("chips", .50);
  }

  @Override
  public void addHamburgerAddition1(String name, double price) {
    System.out.println("You're not allowed to add additions to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition2(String name, double price) {
    System.out.println("You're not allowed to add additions to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition3(String name, double price) {
    System.out.println("You're not allowed to add additions to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition4(String name, double price) {
    System.out.println("You're not allowed to add additions to a deluxe burger");
  }

  @Override
  public Double itemizeHamburger() {
    return super.itemizeHamburger();
  }
}
