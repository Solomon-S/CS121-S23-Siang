package Week3;
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //Variables
        int side1;
        int side2;
        int side3;

        //Asking for input
        System.out.println("Enter length of side 1: ");
        side1 = Integer.parseInt(console.nextLine());
        System.out.println("Enter length of side 2: ");
        side2 = Integer.parseInt(console.nextLine());
        System.out.println("Enter length of side 3: ");
        side3 = Integer.parseInt(console.nextLine());
        
        //Conditions
        if (side1 == side2 && side2 == side3 && side1 == side3){
            System.out.println("This is an Equilateral Triangle ");
        }  else if (side1 == 0 || side2 == 0 || side3 == 0) {
            System.out.println("This is not a Triangle");
        }  else if (side1 != side2 && side1 != side3 && side2 != side3) {
            System.out.println("This is a Scalene Triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("This is an Isosceles Triangle");
        }
    }
}
