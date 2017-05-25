import java.io.Console;

public class Game {
  public static void main(String[] args){
    Console console = System.console();

    Player player1 = new Player();
    Player player2 = new Player();

    System.out.println("Player 1 enter move");
    String player1Input = console.readLine();
    // System.out.println("Player 2 enter move");
    // player2.move = console.readLine();

    //played(player1Input);

    speak();


  }
}
