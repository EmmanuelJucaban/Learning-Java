package com.company;

import java.util.ArrayList;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<String>();

//  add
  public void addItem(String item){
    groceryList.add(item);
  }
//  print
  public void printGroceryList(){
    System.out.println("You have " + groceryList.size() + " items in your grocery list");
    for (int i = 0; i < groceryList.size(); i++) {
      System.out.println((i + 1) + ". "  + groceryList.get(i));
    }
  }
//  modify

  public void modifyItem(int position, String newItem){
    groceryList.set(position, newItem);
    System.out.println("Grocery item " + (position+1) + " has been modified");
  }

  // remove
  public void removeItem(int position){
    String theItem = groceryList.get(position);
    groceryList.remove(position-1);
  }
//  find


  public String findItem(String item){
    int position = groceryList.indexOf(item);
    if(position >= 0){
      return groceryList.get(position);
    }
    return null;
  }
}
