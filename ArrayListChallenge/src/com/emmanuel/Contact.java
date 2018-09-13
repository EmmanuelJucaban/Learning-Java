package com.emmanuel;

public class Contact {
  private String name;
  private String phoneNumber;


  public Contact(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  //   There is no need for setters in this class because we will be using the constructor to set the fields
  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }



  // We want to create a public static method so that we can create
  // a contact record.

  // This will be very useful when we are accessing the functions that are built into the
  // mobile phone.
  // So instead of having to parse the parameter for the name and phone number,
  // we can create a new contact record.
  // And we can create it without creating a separate object.



  // All this is, is a method that calls the constructor and returns the new contact;
  public static Contact createContact(String name, String phoneNumber){
    return new Contact(name, phoneNumber);
  }
}
