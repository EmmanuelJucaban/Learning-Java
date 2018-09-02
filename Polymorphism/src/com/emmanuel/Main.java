package com.emmanuel;

class Movie {
  private String name;

  public Movie(String name) {
    this.name = name;
  }

  public String plot() {
    return "No plot here";
  }

  public String getName() {
    return name;
  }
}

class Jaws extends Movie {
  public Jaws() {
    super("Jaws");
  }

  public String plot(){
    return "A shark that eats people";
  }
}

class IndependenceDay extends Movie{
  public IndependenceDay(){
    super("IndependenceDay");
  }

  public String plot (){
    return "Alien attempts to take over earth";
  }
}

class MazeRunner extends Movie{
  public MazeRunner(){
    super("MazeRunner");
  }

  @Override
  public String plot() {
    return "Kids try to escape a maze";
  }
}

class Starwars extends Movie{
  public Starwars(){
    super("Starwars");
  }

  @Override
  public String plot() {
    return "Imperial forces try to take over earth.";
  }
}



class Forgetable extends Movie{
  public Forgetable(){
    super("Forgetable");
  }
}



public class Main {
  public static void main(String[] args) {
    // write your code here
    for (int i = 1; i < 11; i++) {
      Movie movie = randomMovie();
      System.out.println("Movie #" + i +
                        " : " + movie.getName() + "\n" +
                          "Plot " + movie.plot() + "\n");
    }
  }

  public static Movie randomMovie(){
    int randomNumber = (int) (Math.random() * 5) + 1;
    switch (randomNumber) {
      case 1:
        return new Jaws();
      case 2:
        return new MazeRunner();
      case 3:
        return new IndependenceDay();
      case 4:
        return new Starwars();
      case 5:
        return new Forgetable();
    }
    return null;
  }
}
