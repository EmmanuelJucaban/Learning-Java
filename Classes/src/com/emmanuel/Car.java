package com.emmanuel;


// This is the statement that creates a new class named car
// The public key word is an access identifier that we use
// to determine what access we want to allow others to have to this new class we're creating
// Usually, at least initially anyway, we're gonna be using public for
// pretty much all of our classes
// But other access modifiers we could use include private,
// that's where no other class can access that class.
// We can also remove the access modifier completely if we prefer
public class Car {

  //  Now, classes allow us to create variables that can be seen and
  //  are accessible from anywhere within the class that we're creating.
  //  Now, these are known as class or member variables, but
  //  most commonly refer to them as fields.
  //  Now, when you're creating a field for a class,
  //  you need to also specify an excess modifier that works the same way as
  //  the excess modifier for a class definition did.
  //  Now as a general rule, when you're defining fields in Java in a class, you go
  //  with the access modifier private, unlike the class where we've gone with public.
  //  So what private means when talking about fields is, well,
  //  what we're really doing with it is we're adhering to encapsulation
  //  which is a key fundamental rule of object-orientated programming.
  //  So encapsulation in Java is used to hide the fields and methods,
  //  which we'll see later, from access publicly.
  //  So, it really means that the internal representation of an object is
  //  gonna be hidden from view outside the object's definition.
  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String colour;

  //  So the next thing we need to do is we need to create an object from this class,
  //  cuz if you recall, the class is just the template.
  //  But we need to create an object which will sort of take that blueprint,
  //  that definition that we've defined in the class and
  //  create an object that we can start using.

}
