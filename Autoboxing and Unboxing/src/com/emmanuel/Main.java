package com.emmanuel;

public class Main {

  public static void main(String[] args) {
    Bank wellsFargo = new Bank("Wells Fargo");

    if(!wellsFargo.addBranch("wells fargo")) {
      System.out.println("Sorry a branch already exists with that name");
    }

    wellsFargo.addCustomer("wells fargo", "Shane", 12.00);
    wellsFargo.addCustomer("wells fargo", "Manny", 12000.00);
    wellsFargo.addCustomer("wells fargo", "Frank", 120.00);

    wellsFargo.addCustomerTransaction("wells fargo", "Shane", 120.00);

    wellsFargo.listCustomers("wells fargo", true);
















    // write your code here
    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions
  }
}
