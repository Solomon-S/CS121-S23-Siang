package Week4;
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        //Variables
        int randNum;
        int guessNum = 0;
        boolean correct = false;
        String guess;

        // *** ADDED to hold the converted int to String variable guess
        int numGuess;

        randNum = random.nextInt(100);
        // *** ----- Checking to make sure random number stays the same --------
        System.out.println("Random number :"+randNum);

        // *** --- Moved outside of while loop ------
        System.out.println("Guess a number between 1 and 100, or enter 'q' if you give up:");

        while (correct == false)
        {
            guess = console.nextLine();

            //Conditions
            // **** ------Check first condition of q -----
            //added***********
            if(guess .equals("q")){
                System.out.println("Quitter! The number was " + randNum);
                System.out.println("\nNumber of guesses: " + guessNum);
                // Add break; ****
                break;
            }
            // *** ----- have an else statement to hold the rest of information -----
            else {
                // *** ----- ONE TIME USE -------.
                numGuess =Integer.parseInt(guess);
                if (numGuess > randNum) {
                    System.out.println("Too high. Guess again:");
                    guessNum++;
                } else if (numGuess < randNum) {
                    System.out.println("Too low. Guess again:");
                    guessNum++;
                } else {
                    System.out.println("Correct!");
                    System.out.println("Number of guesses: " + guessNum);
                    correct = true;

                }

            }
        }

    }
}
