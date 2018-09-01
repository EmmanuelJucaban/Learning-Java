package com.emmanuel;

public class Outlander extends Car {
  private int roadServiceMonths;

  public Outlander(int roadServiceMonths) {
    super("Outlander", "Large", 4, 4, 4, false);
    this.roadServiceMonths = roadServiceMonths;
  }

  public void accelerate(int rate){
    int newVelocity = this.getCurrentVelocity() + rate;
    if(newVelocity == 0) {
      stop();
    } else if (newVelocity < 10) {
      changeGear(1);
    } else if (newVelocity > 10 && newVelocity < 20) {
      changeGear(2);
    } else if (newVelocity > 20 && newVelocity < 30) {
      changeGear(3);
    } else {
      changeGear(4);
    }

    if(newVelocity > 0) {
      changeVelocity(newVelocity, this.getCurrentDirection());
    }
  }
}
