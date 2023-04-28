package Week2;
import java.util.Scanner;
public class BookClubPoints {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);

        //Asking for input
        System.out.println("Number of Books: ");
        int numOfBooks = Integer.parseInt(console.nextLine());

        //Declare variables
        int points = 0;



        //Conditions
        if (numOfBooks == 0) {
            points = 0;
        }
        else if (numOfBooks == 1) {
            points = 5;
        }
        else if (numOfBooks == 2) {
            points = 15;
        }
        else if (numOfBooks == 3) {
            points = 30;
        }
        else if (numOfBooks >= 4) {
            points = 60;
        }

        //Outputs
        if (points == 0) {
            System.out.println("Points: " + points);
        }
        if (points == 5) {
            System.out.println("Points: " + points);
        }
        if (points == 15) {
            System.out.println("Points: " + points);
        }
        if (points == 30) {
            System.out.println("Points: " + points);
        }
        if (points == 60) {
            System.out.println("Points: " + points);
        }

    }
}
