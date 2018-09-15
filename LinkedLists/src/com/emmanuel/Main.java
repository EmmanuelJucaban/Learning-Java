package com.emmanuel;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Customer customer1 = new Customer("Manny", 120.00);
    Customer anotherCustomer;
    anotherCustomer = customer1;

    customer1.setBalance(1.00);

    System.out.println("Balance for customer " + anotherCustomer.getName() + " is " + anotherCustomer.getBalance());
    System.out.println("Balance for customer " + customer1.getName() + " is " + customer1.getBalance());


    ArrayList<Integer> intList = new ArrayList<Integer>();
    intList.add(1);
    intList.add(2);
    intList.add(4);


    // An override version of add. Takes the index as 1st arg and the element to replace at arg2
    intList.add(2, 3);


    for (int i = 0; i < intList.size(); i++) {
      System.out.println("Int is " + intList.get(i));
    }

  }
}
