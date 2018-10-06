package com.emmanuel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Player tim = new Player("Tim", 100, 10);
    System.out.println(tim.toString());
    saveObject(tim);

    tim.setHitPoints(10);
    System.out.println(tim);
    tim.setWeapon("Stormbringer");
    saveObject(tim);
    loadObject(tim);
    System.out.println(tim);
  }

  public static ArrayList<String> readValues() {
    ArrayList<String> values = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);

    boolean quit = false;
    int index = 0;
    System.out.println("Choose\n" +
                    "1 to enter a string\n" +
                    "2 to quit");

    while(!quit) {
      System.out.println("Choose an options");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice){
        case 0:
          quit = true;
          break;
        case 1:
          System.out.println("Enter a string: ");
          String stringInput = scanner.nextLine();
          values.add(index, stringInput);
          index++;
          break;
      }
    }
    return values;
  }

  // We are passing in the iSaveable interface here
  // This allows us to pass in any object using the iSaveable interface
  public static void saveObject(iSaveable objectToSave){
    // Remember that the write function is actually adding values to the List
    // Note that the list is also an ArrayList
    for (int i = 0; i < objectToSave.write().size(); i++) {
      System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
    }
  }

  public static void loadObject(iSaveable objectToLoad){
    ArrayList<String> values = readValues();
    objectToLoad.read(values);
  }
}
