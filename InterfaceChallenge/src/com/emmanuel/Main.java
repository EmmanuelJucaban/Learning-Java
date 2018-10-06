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
//    loadObject(tim);
    System.out.println(tim);


    // It can be confusing as to when to declare an instance as the class
    // Generally speaking, it depends on what we're going to do with that instance
    // If we wanted to declare a variable that can hold objects of different types,
    // Then it would have the type of the common interface

    // But if we wanted to access methods that exist in the class
    // Then the object will have to be declared as the class type itself

    // Generally speaking, when there's no strong reason for using the class type,
    // in this case there's really no strong need to use the monster class type,
    // because we have these generic methods for reading and writing,
    .// and we can access those in a similar way
    // wit that being the case, we probably want to declare it using the interface
    // because it keeps the code more generic and
    // we're making the best use of interfaces
    iSaveable monster = new Monster("Monster1", 100, 10);
    System.out.println(monster.toString());
    // Because we used iSaveable as the base class of monster,
    // we cannot use getStrength on it
    // It works like this because we're casting it to a Monster class
    System.out.println("Strength = " + ((Monster) monster).getStrength());
    saveObject(monster);
    System.out.println(monster);

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
