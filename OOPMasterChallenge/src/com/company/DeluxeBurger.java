package com.company;

public class DeluxeBurger extends Hamburger {
  private String name;
  private double price;
  private String breadRollType;
  private String meat;

  private String chipsAddition;
  private double chipsPrice;

  private String drinkAddition;
  private double drinkPrice;

  public DeluxeBurger(String meat, String breadRollType, String chipsAddition, double chipsPrice, String drinkAddition, double drinkPrice){
    super("Deluxe burger", meat, breadRollType);
    this.chipsAddition = chipsAddition;
    this.chipsPrice = chipsPrice;
    this.drinkAddition = drinkAddition;
    this.drinkPrice = drinkPrice;
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
    double deluxeBurgerPrice = super.itemizeHamburger();
    if(this.chipsAddition != null) {
      deluxeBurgerPrice += chipsPrice;
    }

    if(this.drinkAddition != null) {
      deluxeBurgerPrice += drinkPrice;
    }
    return deluxeBurgerPrice;
  }
}
