package com.emmanuel;

public class Main {

  public static void main(String[] args) {
    //  write your code here
//    Player player1 = new Player();
//    player1.health = 10;
//    player1.loseHealth(9);
//    player1.loseHealth(1);
//    System.out.println(player1.healthRemaining());
//

    EnhancedPlayer player = new EnhancedPlayer("Manny", 10, "great");
    player.getName();
    player.loseHealth(9);
    System.out.println(player.remainingHealth());
    player.loseHealth(1);
    System.out.println(player.remainingHealth());
  }
}
