import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {   //while loop to check if user have to play again or not

            // Computer random Input
            String[] rps = {"r", "p", "s"}; //string array of r,p,s
            String computer_move = rps[new Random().nextInt(rps.length)];  //taking random from array upto array length i.e 3


            String player_move;

            // To take Valid input from user
            while (true) {
                System.out.println("Please Enter Your Move(r, p or s) ");
                player_move = scanner.nextLine();
                if (player_move.equals("r") || player_move.equals("p") || player_move.equals("s")) {
                    break;
                }
                System.out.println(player_move + "is not a valid move.");
            }

            // To check computer input
            System.out.println("Computer played :" + computer_move); // Displays computer move on screen

            if (player_move.equals(computer_move)) { //For tie condition
                System.out.println("The was a Tie");
            } else if (player_move.equals("r")) {
                if (computer_move.equals("p")) {
                    System.out.println("You lose!");
                } else if (computer_move.equals("s")) {
                    System.out.println("You Win!");
                }
            } else if (player_move.equals("p")) {
                if (computer_move.equals("r")) {
                    System.out.println("You Win!");
                } else if (computer_move.equals("s")) {
                    System.out.println("You lose!");
                }
            } else if (player_move.equals("s")) {
                if (computer_move.equals("r")) {
                    System.out.println("You lose!");
                } else if (computer_move.equals("p")) {
                    System.out.println("You Win!");
                }
            }
            System.out.println("Play Again? (y/n)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")){
                break;
            }
        }scanner.close();

    }
}
