package Week5;
import java.util.Scanner;
public class MethodsActivity {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double l = getLength();
        double w = getWidth();
        double a = getArea(l,w);
        displayData(l,w,a);


        scanner.close();
    }
    //Method to get length
    public static Double getLength()
    {
        System.out.println("Enter rectangle's length: ");
        double length = Double.parseDouble(scanner.nextLine());
        return length;

    }
    public static Double getWidth()
    {
        System.out.println("Enter rectangle's width: ");
        double width = Double.parseDouble(scanner.nextLine());
        return width;
    }
    public static Double getArea(double length,double width)
    {
        double area = length * width;
        return area;
    }
    public static void displayData(double length, double width, double area)
    {
        System.out.println("Rectangle length:\n" + length);
        System.out.println("Rectangle width:\n" + width);
        System.out.println("Rectangle area:\n" + area);
    }
}
