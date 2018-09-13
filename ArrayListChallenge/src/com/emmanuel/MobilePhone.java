package com.emmanuel;

import java.util.ArrayList;

public class MobilePhone {
  private ArrayList<Contact> myContacts;
  private String myNumber;


  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<Contact>();
  }

  public String getMyNumber() {
    return myNumber;
  }

  public void getContacts() {
    System.out.println("Here are your contacts and their phone number");
    for (int i = 0; i < myContacts.size(); i++) {
      System.out.println("Name:" + myContacts.get(i).getName() + " Phone: " + myContacts.get(i).getPhoneNumber());
    }
  }

  public boolean addContact(Contact contact) {
    if (findContact(contact.getName()) >= 0) {
      System.out.println("Contact is already on file");
      return false;
    }

    myContacts.add(contact);
    return true;
  }


  public boolean removeContact(Contact contact) {
    int foundPosition = findContact(contact);

    if(foundPosition < 0) {
      System.out.println("Contact you're trying to delete does not exist");
      return false;
    }

    removeContact(foundPosition);
  }




  public boolean updateContact(Contact oldContact, Contact newContact) {
    int foundPosition = findContact(oldContact);

    if(foundPosition < 0) {
      System.out.println("Contact already exists!");
      return false;
    }

    updateContact(foundPosition, newContact);
    return true;
  }


  private void removeContact(int position) {
    System.out.println("Contact name: " + myContacts.get(position).getName() + " has been deleted");
    this.myContacts.remove(position);
  }

  private void updateContact(int position, Contact newContact) {
    this.myContacts.set(position, newContact);
    System.out.println("Updated contact");
  }



  private int findContact(Contact contact) {
   return this.myContacts.indexOf(contact);
  }

  private int findContact(String contactName){
    for (int i = 0; i < myContacts.size(); i++) {
      Contact contact = this.myContacts.get(i);
      if(contact.getName().equals(contactName)){
        return i;
      }
    }
    return -1;
  }
}
