package Week3;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Asking for input
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(console.nextLine());
        boolean even = false;
        //Condition
        if (num % 2 == 0){
            even = true;
        }
        else{
            even = false;
        }

        //Output
        if (even == true){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
