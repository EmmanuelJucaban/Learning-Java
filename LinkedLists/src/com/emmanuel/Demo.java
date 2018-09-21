package com.emmanuel;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    // Java implements this LinkedList class as a doubly linked list
    // It stores the previous item as well as the next item
    LinkedList<String> placesToVisit = new LinkedList<String>();
    addInOrder(placesToVisit, "Sydney");
    addInOrder(placesToVisit, "Melbourne");
    addInOrder(placesToVisit, "Brisbane");
    addInOrder(placesToVisit, "Perth");
    addInOrder(placesToVisit, "Canberra");
    addInOrder(placesToVisit, "Adelaide");
    addInOrder(placesToVisit, "Darwin");

    addInOrder(placesToVisit, "Alice Springs");
    addInOrder(placesToVisit, "Darwin");

    visit(placesToVisit);

//    placesToVisit.add(2"Sydney");
//    placesToVisit.add("Melbourne");
//    placesToVisit.add("Brisbane");
//    placesToVisit.add("Perth");
//    placesToVisit.add("Canberra");
//    placesToVisit.add("Adelaide");
//    placesToVisit.add("Darwin");

    // Insertion on a LinkedList is faster
    // Under the hood, it changes the
    // pointers to the elements for us already
    placesToVisit.add(1, "Alice");
    printList(placesToVisit);

    placesToVisit.remove(7);
    printList(placesToVisit);
  }



  public static void printList(LinkedList<String> linkedList){
    // A concept of an iterator
    // An iterator is another way of accessing
    // and going through all of the entries
    // in an Array, ArrayList, or a LinkedList etc

    // This is equivalent to a for loop
    Iterator<String> i = linkedList.iterator();
    // hasNext is checking to see if there's another entry
    while(i.hasNext()){
      // .next is actually moving on to the next entry
      // It's also getting the current value that it's on
      // before it moves on
      // The i.next is equivalent to doing an i++
      // AND also getting the next record
      System.out.println("Now visiting " + i.next());
    }
    System.out.println("============");
  }

  private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {


    // !!!!!!!!
    // Usually writing methods like these that cause side effects
    // such as using next should generally be avoided
    // So unless you really know what you're doing
    // It's not a good idea to write a method that both returns a value
    // and changes the object that it's called from
    // So we're returning that it's true or false
    // BUT we're modifying the LinkedList that was parsed by it
    // We are actually changing the actual entries AKA parameters/arguments




    // A listIterator gives us more flexibility than a regular iterator
    // It's really made for situations like this where
    // we're inserting certain records or so forth

    // Put a listIterator on the linkedList that we're passing in

    // This is not actually pointing to the first record
    // We actually have to call next method to access the first record
    ListIterator<String> stringListIterator = linkedList.listIterator();

    // Loop through everything in the linkedList
    while(stringListIterator.hasNext()){

      // We are going to use a compareTo function here
      // Compare the current city we're on to the passed in argument
      // The compareTo method is a String method
      int comparison = stringListIterator.next().compareTo(newCity);
      System.out.println("comparison " + comparison);
      // The compareTo gives us a number of type int
      // If it returns 0, it means that both the value and the comparator are the same
      if(comparison == 0) {
        // equal do not add
        // It means the entry already exists in the linkedlist
        System.out.println(newCity + " is already included as a destination");
        // We return false meaning that it wasn't successfully added
        return false;
      } else if (comparison > 0) {
        // Else if the comparison is greater than 0
        // What that means is that the item should come before the value being compared
        // New should appear before this one
        // Brisbane -> Adelaide

        // Since we already called next, it moved to the next entry automatically
        // So we need to go back to the previous entry again which is the one we're at

        // Previous goes back to the earlier entry

        stringListIterator.previous();
        // Adds new city to the right position

        // This is the reason we use a ListIterator
        // We can't go back using a regular iterator
        // We are forced to go through the whole thing with a regular iterator
        // And there's no way of going back
        stringListIterator.add(newCity);
        // Since we successfully added a record, we can return true
        return true;
      } else if (comparison < 0) {
        // If the comparison is less than 0, that means we don't need to do anything
        //
      }
    }
    // In case we go through the whole list without finding a suitable point to add the entry,
    // We just add it to the end.

    stringListIterator.add(newCity);

    // return true. We successfully added a new city
    return true;
  }

  public static void visit(LinkedList cities){
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean goingForward = true;
    ListIterator<String> listIterator = cities.listIterator();

    if(cities.isEmpty()){
      System.out.println("No cities in the itinerary");
      return;
    } else {
      System.out.println("Now visiting " + listIterator.next());
      printMenu();
    }

    while(!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();
      switch(action){
        case 0:
          System.out.println("Vacation over");
          quit = true;
          break;
        case 1:
          if(!goingForward) {
            if(listIterator.hasNext()){
              listIterator.next();
            }
            goingForward = true;
          }
          if(listIterator.hasNext()){
            System.out.println("Now visiting " + listIterator.next());
          } else {
            System.out.println("Reached the end of the list");
            goingForward = false;
          }
          break;
        case 2:
          if(goingForward) {
            if(listIterator.hasPrevious()){
              listIterator.previous();
            }
            goingForward = false;
          }
          if(listIterator.hasPrevious()) {
            System.out.println("Now visiting " + listIterator.previous());
          } else {
            System.out.println("We are at the start of the list");
            goingForward = true;
          }
          break;
        case 3:
          printMenu();
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("Available actions:\npress ");
    System.out.println("0 to quit\n" +
                        "1 - go to next city\n" +
                        "2 - go to previous city\n" +
                        "3 - print options");
  }
}
