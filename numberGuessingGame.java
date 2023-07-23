import java.util.Random;
import java.util.Scanner;

class numberGuessingGame{
    public static void startGame()
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(100)+1;
        int count=0;
        System.out.println();
        while(true)
        {
           System.out.println("Enter Your Guess(1-100): ");
           int playerGuess=sc.nextInt();
           count++;
           if(playerGuess == randomNumber)
           {
            System.out.println();
            System.out.println("Correct! You Win! ");
            System.out.println("It took you "+count+" tries...");
            break;
           }
           else if(playerGuess < randomNumber)
           {
            System.out.println("Nope! The number is higher.Guess again.");
           }
           else
           {
            System.out.println("Nope! The number is lower.Guess again.");
           }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome To Anshuman's Game House...");
        System.out.println("Enter your Name : ");
        String name = s.nextLine();
        System.out.println("hello "+name+"!!!");
        System.out.println("Let's play a game.  I'll pick a number between");
        System.out.println("1 and 100, and you try to guess it.");
        int  playAgain;
        do
        {
            startGame();
            System.out.println("Would you like to play again?");
            System.out.println("Enter 1 For : YES  or Enter 0 For :NO ");
            playAgain=s.nextInt();
        }
        while(playAgain==1);
        System.out.println("Thanks for playing....");
    }
 }