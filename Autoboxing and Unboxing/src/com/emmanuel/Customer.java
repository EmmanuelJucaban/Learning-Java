package com.emmanuel;

import java.util.ArrayList;

public class Customer {
  private ArrayList<Double> transactions;
  private String name;

  public Customer(String name, Double initialAmount) {
    this.name = name;
    this.transactions = new ArrayList<Double>();
    addTransaction(initialAmount);
  }

  public void addTransaction(Double amount) {
    this.transactions.add(amount);
  }

  public ArrayList<Double> getTransactions() {
    return transactions;
  }

  public String getName() {
    return name;
  }

  public void printTransactions() {
    System.out.println("Here are your transactions");
    for (int i = 0; i < this.transactions.size(); i++) {
      System.out.println("Transaction " + (i + 1) + " " + this.transactions.get(i));
    }
  }
}
