public class Player{
  String move;

  public static String identifyMove (String playerInput){
    if (playerInput.equals("rock")){
      return "rocker";
    } else {
      return "nope";
    }
  }
  public static Boolean played(String word) {
    if (word.length() > 0){
      return true;
    } else {
      return false;
    }
  }

  public void speak() {
    System.out.println("Whyyyyyyy");
  }

  // public static String playGame (String player1Move, String player2Move){
  //   if (player1Move.equals("rock"))
  //
  //
  // }
}
