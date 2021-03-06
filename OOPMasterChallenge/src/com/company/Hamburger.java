package com.company;

public class Hamburger {
  private String name;
  private String meat;
  private double  price = 5.50;
  private String breadRollType;

  private String addition1Name;
  private Double addition1Price;

  private String addition2Name;
  private Double addition2Price;

  private String addition3Name;
  private Double addition3Price;

  private String addition4Name;
  private Double addition4Price;


  public Hamburger(String name, String meat, String breadRollType) {
    this.name = name;
    this.meat = meat;
    this.breadRollType = breadRollType;
  }

  public void addHamburgerAddition1(String name, double price){
    this.addition1Name = name;
    this.addition1Price = price;
  }

  public void addHamburgerAddition2(String name, double price){
    this.addition2Name = name;
    this.addition2Price = price;
  }

  public void addHamburgerAddition3(String name, double price){
    this.addition3Name = name;
    this.addition3Price = price;
  }

  public void addHamburgerAddition4(String name, double price){
    this.addition4Name = name;
    this.addition4Price = price;
  }

  public Double itemizeHamburger(){
    double hamburgerPrice = this.price;
    System.out.println(this.name + " hamburger " + "on a " + this.breadRollType + " roll " +
        " price is " + this.price);

    if(this.addition1Name != null) {
      hamburgerPrice += this.addition1Price;
      System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
    }

    if(this.addition2Name != null) {
      hamburgerPrice += this.addition2Price;
      System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
    }

    if(this.addition3Name != null) {
      hamburgerPrice += this.addition3Price;
      System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
    }

    if(this.addition3Name != null) {
      hamburgerPrice += this.addition4Price;
      System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
    }

    return hamburgerPrice;
  }
}


// front end
socket.emit('triggerDocChange', {editorState, docId});


socket.on('docChanged', {editorState} => {

})
// backend

socket.on('triggerDocChange', ({editorState, docId} => {
      Document.findOneAndUpdate({_id: docId}, {content: editorState}).then(document => {
        socket.to(doc.id).emit("docChanged", {editorState: document.content});
        });
}));
