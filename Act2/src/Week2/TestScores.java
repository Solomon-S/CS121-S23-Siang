package Week2;
import java.util.Scanner;
public class TestScores {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);

        //Asking for input
        System.out.println("Your first test score: ");
        int firstScore = Integer.parseInt(console.nextLine());
        System.out.println("Your second test score: ");
        int secondScore = Integer.parseInt(console.nextLine());
        System.out.println("Your third test score: ");
        int thirdScore = Integer.parseInt(console.nextLine());

        //Variables
        int avgScore;
        String grade = null;

        //Calculations
        avgScore = (firstScore + secondScore + thirdScore)/3;

        //Conditions
        if (avgScore >= 90) {
            grade = "A";
        } else if (avgScore >=80) {
            grade = "B";
        } else if (avgScore >= 70) {
            grade = "C";
        } else if (avgScore >= 60) {
            grade = "D";
        } else if (avgScore <= 60) {
            grade = "F";
        }
        //Outputs
        if (grade.equals("A")) {
            System.out.println("Your Grade: " + grade);
        } else if (grade.equals("B")) {
            System.out.println("Your Grade: " + grade);
        } else if (grade.equals("C")) {
            System.out.println("Your Grade: " + grade);
        } else if (grade.equals("D")) {
            System.out.println("Your Grade: " + grade);
        } else if (grade.equals("F")) {
            System.out.println("Your Grade: " + grade);
        }
    }
}
