package com.emmanuel;

public class Player {
  public String name;
  public int health;
  public String weapon;

  public void loseHealth(int damage) {
    this.health -= damage;
    if(this.health <= 0) {
      System.out.println(name + " is knocked out!");
    }
  }

  public int healthRemaining() {
    return health;
  }
}
