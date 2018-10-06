package com.emmanuel;


// An interface, in Java terms, specifies methods that
// a particular class that implements the interface must implement


// Now the interface that we're creating is abstract and that means there's no actual code
// for any of the methods, we only supply the method names and parameters
// The actual code still goes to the actual class that we're creating

// But the idea is that is to use an interface to provide a common behavior that
// can be used by several classes by having them all implement the same interface


// It's really a way to standardize the way a particular set is used
//


// What we did here is we said that for a class that implements this interface
// these are the methods that is hate to implement
// What we defined here is just the contract
// In other words, the contract and the actual parameters
// and return types that are valid for each method
// that overall will make this a valid class, effectively

// Note that private of public are not in each method and that actually makes sense
// and that's because we're actually implementing an interface in a class
// so the interface exists to define methods that must be implemented

// So in other words, private and public are actually useless, in essence
// because we're actually going to be doing that in the actual class.

public interface ITelephone {
  void powerOn();
  void dial(int phoneNumber);
  void answer();
  boolean callPhone(int phoneNumber);
  boolean isRinging();
}
