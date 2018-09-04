package com.company;

import java.util.ArrayList;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<String>();

  public ArrayList<String> getGroceryList() {
    return groceryList;
  }

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

  public void modifyItem(String currentItem, String newItem){
    int position = findItem(currentItem);
    if(position >= 0) {
      modifyItem(position, newItem);
    }
  }


  private void modifyItem(int position, String newItem){
    groceryList.set(position, newItem);
    System.out.println("Grocery item " + (position+1) + " has been modified");
  }

  // remove

  public void removeItem(String newItem){
    int position = findItem(newItem);
    if(position >= 0) {
      removeItem(position);
    }
  }

  private void removeItem(int position){
    groceryList.remove(position);
  }
//  find


  private int findItem(String searchItem){
    return groceryList.indexOf(searchItem);
  }

  public boolean onFile(String searchItem){
    int position = findItem(searchItem);
    return position >= 0;
  }


}
