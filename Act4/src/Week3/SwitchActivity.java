package Week3;
import java.util.Scanner;
public class SwitchActivity {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String planet;

        //Ask user to enter name of planet
        System.out.println("Enter the name of a planet within our solar system: ");
        planet = console.nextLine();

        switch(planet){
            case "Mercury":
                System.out.println("Size (in radius): 1516 miles");
                break;
            case "Venus":
                System.out.println("Size (in radius): 3760 miles");
                break;
            case "Earth":
                System.out.println("Size (in radius): 3958 miles");
                break;
            case "Mars":
                System.out.println("Size (in radius): 2106 miles");
                break;
            case "Jupiter":
                System.out.println("Size (in radius): 43441 miles");
                break;
            case "Saturn":
                System.out.println("Size (in radius): 36184 miles");
                break;
            case "Uranus":
                System.out.println("Size (in radius): 15759 miles");
                break;
            case "Neptune":
                System.out.println("Size (in radius): 15299 miles");
                break;
        }
    }
}
