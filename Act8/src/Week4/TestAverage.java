package Week4;
import java.util.Scanner;
public class TestAverage {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        int numStudents;
        int numTest;
        int testScore;
        int sum = 0;
        double average = 0;

        //Enter number of Students
        System.out.println("Enter Number of Students: ");
        numStudents = Integer.parseInt(input.nextLine());

        //Enter number of Tests per student
        System.out.println("Enter Number of tests per student: ");
        numTest = Integer.parseInt(input.nextLine());

        //First for Loop - outside// Prints the number of tests (x) times
        for (int i = 1; i <= numStudents; i++) {
            testScore = 0;
            System.out.printf("Student number %d\n", i);
            System.out.println("-".repeat(14));
            //Second for loop - inside
            for (int j = 0; j < numTest; j++) {
                System.out.printf("Enter score for test: ");
                testScore = Integer.parseInt(input.nextLine());
                sum += testScore;

                //Calculates average the test scores
                average = sum/numTest;

            }
            //Show test average
            System.out.printf("The average test score " + average + "\n");
        }
    }
}

