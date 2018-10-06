package com.emmanuel;



// We use the implements keyword

// Normally, we would get an error when we create this class without the interface methods
// We can actually create stubs for these methods, "Empty methods" so that the error goes away
//
public class DeskPhone implements ITelephone {
  private int myNumber;
  private boolean isRinging;


  public DeskPhone(int myNumber) {
    this.myNumber = myNumber;
  }

  @Override
  public void powerOn() {
    System.out.println("No action taken. Desk phone does not have a power button");
  }

  @Override
  public void dial(int phoneNumber) {
    System.out.println("Now ringing " + phoneNumber + " on desk phone");
  }

  @Override
  public void answer() {
    if(isRinging) {
      System.out.println("Answering desk phone");
      isRinging = false;
    }
  }

  @Override
  public boolean callPhone(int phoneNumber) {
    if(phoneNumber == myNumber) {
      isRinging = true;
      System.out.println("Ring ring");
    } else {
      isRinging = false;
    }
    return isRinging;
  }

  @Override
  public boolean isRinging() {
    return isRinging;
  }
}
