package com.company;

public class HealthyBurger extends Hamburger {

  private String addition5Name = "cheese";
  private Double addition5Price = .50d;

  private String addition6Name = "bacon";
  private Double addition6Price = .50d;

  public HealthyBurger(String meat){
    super("Healthy burger", meat, "brown rye bread roll");
  }

  public void setAddition5(String addition5Name, double price) {
    this.addition5Name = addition5Name;
    this.addition5Price = price;
  }

  public void setAddition6(String addition6Name, double price) {
    this.addition6Name = addition6Name;
    this.addition6Price = price;
  }

  @Override
  public Double itemizeHamburger() {
    double hamburgerPrice = super.itemizeHamburger();

    if(this.addition5Name != null) {
      hamburgerPrice += addition5Price;
      System.out.println("Added " + this.addition5Name + " for an extra " + this.addition5Price);
    }

    if(this.addition6Name != null) {
      hamburgerPrice += addition6Price;
      System.out.println("Added " + this.addition6Name + " for an extra " + this.addition6Price);
    }

    return hamburgerPrice;
  }
}
