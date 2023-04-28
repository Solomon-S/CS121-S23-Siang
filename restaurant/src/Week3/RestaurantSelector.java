package Week3;
import java.util.Scanner;
public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Variables
        String vegetarian;
        String vegan;
        String gf;
        String joe = "Joe's Gourmet Burger";
        String msp = "Main Street Pizza Company";
        String cc = "Corner Cafe";
        String mfi = "Mama's Fine Italian";
        String tck = "The Chef's Kitchen";


        //Asking Questions
        System.out.println("Is anyone in your party a vegetarian?: ");
        vegetarian = console.nextLine();
        System.out.println("Is anyone in your party a vegan?: ");
        vegan = console.nextLine();
        System.out.println("Is anyone in your party gluten-free?: ");
        gf = console.nextLine();

        //Conditions
        if(vegetarian.equals("no") && vegan.equals("no") && gf.equals("no")){
            System.out.println("Here are your restaurant choices: " +"\n"+ joe + "\n"+ msp +"\n"+ cc +"\n"+ mfi +"\nn"+ tck);
        } else if (vegetarian.equals("yes") && vegan.equals("no") && gf.equals("yes")){
            System.out.println("Here are your restaurant choices: " + "\n" + msp + "\n" + cc + "\n" + tck);
        } else if (vegetarian.equals("yes") && vegan.equals("yes") && gf.equals("yes")) {
            System.out.println("Here are your restaurant choices: " + "\n" + cc + "\n" + tck);
        } else if (vegetarian.equals("no") && vegan.equals("no") && gf.equals("yes")) {
            System.out.println("Here are your restaurant choices: " + "\n" + msp + "\n" + cc + "\n" + tck);
        } else if (vegetarian.equals("no") && vegan.equals("yes") && gf.equals("yes")) {
            System.out.println("Here are your restaurant choices: " +  "\n" + cc + "\n" + tck);
        } else if (vegetarian.equals("yes") && vegan.equals("yes") && gf.equals("no")) {
            System.out.println("Here are your restaurant choices: " + "\n" + cc + "\n" + tck);
        } else if (vegetarian.equals("yes") && vegan.equals("no") && gf.equals("no")) {
            System.out.println("Here are your restaurant choices: " + "\n" + msp + "\n" + cc + "\n" + tck + "\n" + mfi);
        } else if (vegetarian.equals("no") && vegan.equals("yes") && gf.equals("no")) {
            System.out.println("Here are your restaurant choices: " + "\n" + cc + "\n" + tck);
        }
    }
}
