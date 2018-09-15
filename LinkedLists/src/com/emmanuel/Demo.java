package com.emmanuel;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<String>();

    placesToVisit.add("Sydney");
    placesToVisit.add("Melbourne");
    placesToVisit.add("Brisbane");
    placesToVisit.add("Perth");
    placesToVisit.add("Canberra");
    placesToVisit.add("Adelaide");
    placesToVisit.add("Darwin");


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
}
