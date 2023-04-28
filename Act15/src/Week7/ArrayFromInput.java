package Week7;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String[] firstNames = new String[3];
        String[] lastNames = new String[3];
        int[] creditHours = new int[3];

        for (int i = 0; i < 3; i++)
        {
            System.out.println("First Name: ");
            firstNames[i] = console.nextLine();
            System.out.println("Last Name: ");
            lastNames[i] = console.nextLine();
            System.out.println("Credit Hours: ");
            creditHours[i] = Integer.parseInt(console.nextLine());
            System.out.println();

        }

        System.out.printf("%-14s %s\n", "Name", "Credit Hours");

        for (int i = 0; i<firstNames.length; i++)
        {
            System.out.printf("%-14s %d\n", firstNames[i] + " " + lastNames[i], creditHours[i]);
        }
        console.close();
    }
}
