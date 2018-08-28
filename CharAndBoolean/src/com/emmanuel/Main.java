package com.emmanuel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Chars can only be 1 letter
        // Or any unicode character
        // Has a width of 16 (2 bytes)
        // Chars must be represented in single quotes only
        char myChar = 'D';
        // Unicode chars must have a "\"
        char unicodeChar = '\u00A9';


        boolean myBoolean = true;
        boolean myNotBoolean = false;


        // Strings are usually considered as a 9th data type
        // Strings must be in double quotes
        String myString = "This is a string";
        System.out.println("My string is squal to " + myString);
        myString = myString + " And this is more";
        System.out.println(myString);
        myString = myString + '\u00A9';
        System.out.println(myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        // Javascript does string interpolation
        // Meaning it converts it the number that is being added to it
        // and turns it into a string
        System.out.println(lastString);
    }
}
