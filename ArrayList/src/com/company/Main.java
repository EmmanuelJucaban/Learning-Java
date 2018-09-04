package com.company;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static GroceryList groceryList = new GroceryList();

  public static void main(String[] args) {
    // write your code here
    boolean quit = false;
    int choice = 0;
    printInstructions();

    while (!quit){
      System.out.println("Enter your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice){
        case 0:
          printInstructions();
          break;
        case 1:
          groceryList.printGroceryList();
          break;
        case 2:
          addItem();
          break;
        case 3:
          modifyItem();
          break;
        case 4:
          removeItem();
          break;
        case 5:
          searchForItem();
          break;
        case 6:
          quit = true;
          break;
      }
    }
  }

  public static void printInstructions(){
    System.out.println("\nPress ");
    System.out.println("\t 0 - To print choice options");
    System.out.println("\t 1 - To print the list of grocery items.");
    System.out.println("\t 2 - To add an item to the list.");
    System.out.println("\t 3 - To modify an item in the list.");
    System.out.println("\t 4 - To remove an item from the list.");
    System.out.println("\t 5 - To search for an item in the list ");
    System.out.println("\t 6 - To quit the application.");
  }

  public static void addItem(){
    System.out.println("Please enter the grocery item.");
    groceryList.addItem(scanner.nextLine());
  }

  public static void modifyItem(){
    System.out.println("Enter item number: ");
    int itemNo = scanner.nextInt();
    System.out.println("Enter replacement item: ");
    String item = scanner.nextLine();
    groceryList.modifyItem(itemNo, item);
  }

  public static void removeItem(){
    System.out.println("Enter item number to remove: ");
    int position = scanner.nextInt();
    groceryList.removeItem(position);
  }

  public static void searchForItem(){
    System.out.println("Please enter item name: ");
    String itemName = scanner.nextLine();
    if(groceryList.findItem(itemName) != null) {
      System.out.println("Found item " + itemName + " in your grocery list.");
    } else {
      System.out.println("Item is not in your grocery list.");
    }

  }

}
