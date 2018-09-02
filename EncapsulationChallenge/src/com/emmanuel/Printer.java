package com.emmanuel;

public class Printer {
  private int maxTonerLevel = 100;
  private int tonerLevel = 100;
  private int numberPagesPrinted = 0;
  private boolean isDuplexPrinter;

  public Printer(boolean isDuplexPrinter) {
    this.tonerLevel = tonerLevel;
    this.isDuplexPrinter = isDuplexPrinter;
  }

  public void printPage(int numPages){
    this.numberPagesPrinted += numPages;
    this.tonerLevel -= numPages;
    System.out.println("You have printed " + numPages + " pages");
    System.out.println("Number of total papers printed " + this.numberPagesPrinted);
  }


  public void addToner(int tonerAmount){
    if(this.tonerLevel + tonerAmount > maxTonerLevel) {
      System.out.println("Please put less amount. Toner is full");
    } else {
      this.tonerLevel += tonerAmount;
      System.out.println("Total toner level " + this.tonerLevel);
    }
  }
}
