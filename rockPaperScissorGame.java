import java.util.Random;
import java.util.Scanner;

public class rockPaperScissorGame
{
  public static void main(String[] args) 
  {    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome To Anshuman's Game House...");
    System.out.println("Enter your Name : ");
    String name = scanner.nextLine();
    System.out.println("hello "+name+"!!!");
    System.out.println("Let's play Rock-Paper-Scissor game...");
    while (true) {
      String[] rps = {"Rock", "Paper", "Scissor"};
      String computerMove = rps[new Random().nextInt(rps.length)];
      String playerMove;    
      while(true) {
        System.out.println("Please enter your move (Rock, Paper, or Sissor)");
        playerMove = scanner.nextLine();
        if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissor")) {
          break;
        }
        System.out.println(playerMove + " is not a valid move.");
      }
      
      System.out.println("Computer played: " + computerMove);
      
      if (playerMove.equals(computerMove)) {
        System.out.println("The game was a tie!");
      }
      else if (playerMove.equals("Rock")) {
        if (computerMove.equals("Paper")) {
          System.out.println("You lose!");
          
        } else if (computerMove.equals("Scissor")) {
          System.out.println("You win!");
        }
      }
      
      else if (playerMove.equals("Paper")) {
        if (computerMove.equals("Rock")) {
          System.out.println("You win!");
          
        } else if (computerMove.equals("Scissor")) {
          System.out.println("You lose!");
        }
      }
      
      else if (playerMove.equals("Scissor")) {
        if (computerMove.equals("Paper")) {
          System.out.println("You win!");
          
        } else if (computerMove.equals("Rock")) {
          System.out.println("You lose!");
        }
      }
      
      System.out.println("Play again? (y/n)");
      String playAgain = scanner.nextLine();
      
      if (!playAgain.equals("y")) {
        break;
      }
    }
    System.out.println("Thanks for playing....");
  }
}