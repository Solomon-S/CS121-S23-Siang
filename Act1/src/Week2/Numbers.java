package Week2;

import java.util.Scanner;
import java.lang.Math;

//Name: Solomon Siang
public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Asking for input
        System.out.println("First Number: ");
        int firstNumber = Integer.parseInt(console.nextLine());
        System.out.println("Second Number: ");
        int secondNumber = Integer.parseInt(console.nextLine());

        //Calculations
        int add = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mult = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;
        double fN = Math.sqrt(firstNumber);
        double sN = Math.sqrt(secondNumber);
        double pow = Math.pow(firstNumber,secondNumber);
        double logFirst = Math.log(firstNumber);
        double logSecond = Math.log(secondNumber);


        //Outputs
        System.out.println("Your Numbers: " + (firstNumber) + "," + secondNumber);
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
        System.out.println("Square Roots: " + fN + ", " + sN);
        System.out.println("Power: " + pow);
        System.out.println("Logarithms: " + logFirst + ", " + logSecond);
    }
}
