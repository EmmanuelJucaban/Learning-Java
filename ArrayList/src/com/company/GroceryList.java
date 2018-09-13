package com.company;

import java.util.ArrayList;

public class GroceryList {
  // Tells Java that we want to create an array list that contains Strings
  // An array list as a class so it added the parens automatically
  // Since an array list is a class, it can also have its own Constructor
  private ArrayList<String> groceryList = new ArrayList<String>();

  public ArrayList<String> getGroceryList() {
    return groceryList;
  }

  //  add
  public void addItem(String item){
    // This is similar to JavaScript's push method
    groceryList.add(item);
  }

  //  print
  public void printGroceryList(){
    System.out.println("You have " + groceryList.size() + " items in your grocery list");
    for (int i = 0; i < groceryList.size(); i++) {
      System.out.println((i + 1) + ". "  + groceryList.get(i));
    }
  }


  // Override the modify item to hide the inner workings of the ArrayList
  public void modifyItem(String currentItem, String newItem){
    int position = findItem(currentItem);
    if(position >= 0) {
      modifyItem(position, newItem);
    }
  }

  //  modify
  private void modifyItem(int position, String newItem){
  // This is used to update an item in the ArrayList.
    groceryList.set(position, newItem);
    System.out.println("Grocery item " + (position+1) + " has been modified");
  }


  // Override the removeItem method to hide the inner workings of the ArrayList
  public void removeItem(String newItem){
    int position = findItem(newItem);
    if(position >= 0) {
      removeItem(position);
    }
  }

  // remove
  private void removeItem(int position){
    // How to remove an element from the ArrayList
    // It takes the index of the item that you want to remove
    groceryList.remove(position);
  }

  //  find
  private int findItem(String searchItem){
    // ArrayList has an indexOf method that returns the index of the element you're looking for
    // It returns -1 if not found
    return groceryList.indexOf(searchItem);
  }

  // This is not an override but it is used to hide the inner workings of the ArrayList
  public boolean onFile(String searchItem){
    int position = findItem(searchItem);
    return position >= 0;
  }
}
