import java.util.Scanner;

public class RomanNumeral {
    public static void main(String[] args) {
        int number;          // To hold a number

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get a number from the user.
        System.out.print("Enter a number in the " +
                "range of 1 - 10: ");
        number = keyboard.nextInt();
        switch(number){
            case 1-> System.out.println("I");
            case 2-> System.out.println("II");
            case 3-> System.out.println("III");
            case 4-> System.out.println("IV");
            case 5-> System.out.println("V");
            case 6-> System.out.println("VI");
            case 7-> System.out.println("VII");
            case 8-> System.out.println("VIII");
            case 9-> System.out.println("IX");
            case 10-> System.out.println("X");
            default-> throw new IllegalStateException ("Invalid number."+ number);
        }

    }
}
