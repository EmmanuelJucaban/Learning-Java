package com.emmanuel;

public class MobilePhone implements ITelephone{
  private int myNumber;
  private boolean isRinging;
  private boolean isOn = false;

  public MobilePhone(int myNumber) {
    this.myNumber = myNumber;
  }

  @Override
  public void powerOn() {
    System.out.println("Turning phone on");
    isOn = true;
  }

  @Override
  public void dial(int phoneNumber) {

  }

  @Override
  public void answer() {

  }

  @Override
  public boolean callPhone(int phoneNumber) {
    return false;
  }

  @Override
  public boolean isRinging() {
    return false;
  }
}
