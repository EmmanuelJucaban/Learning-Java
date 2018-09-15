package com.emmanuel;

import java.util.ArrayList;

public class Bank {
  private String name;
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    this.branches = new ArrayList<Branch>();
  }

  public boolean addBranch(String branchName){
    if(findBranch(branchName) == null){
      this.branches.add(new Branch(branchName));
      return true;
    }

    return false;
  }

  public String getName() {
    return name;
  }

  public boolean addCustomer(String branchName, String customerName, Double initialAmount){
    Branch branch = findBranch(branchName);
    if(branch != null) {
      return branch.addNewCustomer(customerName, initialAmount);
    }
    return false;
  }

  public boolean addCustomerTransaction(String branchName, String customerName, Double amount) {
    Branch existingBranch = findBranch(branchName);
    if(existingBranch != null) {
      return existingBranch.addCustomerTransaction(customerName, amount);
    }
    return false;
  }

  private Branch findBranch(String name){
    for (int i = 0; i < this.branches.size(); i++) {
      Branch existingBranch = this.branches.get(i);
      if(existingBranch.getName().equals(name)){
        return existingBranch;
      }
    }
    return null;
  }

  public boolean listCustomers(String branchName, boolean showTransactions){
    Branch branch = findBranch(branchName);
    if(branch != null) {
      System.out.println("Customer details for branch " + branchName);
      ArrayList<Customer> customers = branch.getCustomers();
      for (int i = 0; i < customers.size(); i++) {
        Customer branchCustomer = customers.get(i);
        System.out.println(branchCustomer.getName());
        System.out.println("Customer: " + branchCustomer.getName() + "[" + (i +1) + "]");
        if(showTransactions){
          ArrayList<Double> transactions = branchCustomer.getTransactions();
          for (int j = 0; j < transactions.size(); j++) {
            System.out.println("[" + (j+1) + "]" + " Amount " + transactions.get(j));
          }
        } else {
          return false;
        }
      }
    }
    return false;
  }
}
