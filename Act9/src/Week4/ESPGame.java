package Week4;

import java.util.Scanner;
import java.util.Random;
public class ESPGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        //Variables
        int counter = 0;
        String randColor = null;
        String chosenColor;
        int score = 0;

        //Conditions

        //Loop
        while (counter < 10)
        {
            int randomInt = random.nextInt(5);

            //Conditions
            if(randomInt == 0){
                randColor = "red";
            } else if (randomInt == 1) {
                randColor = "green";
            } else if (randomInt == 2) {
                randColor = "blue";
            } else if (randomInt == 3) {
                randColor = "orange";
            } else if (randomInt == 4) {
                randColor = "yellow";
            }
            //Question
            System.out.println("What color has the computer chosen?");
            chosenColor = console.nextLine();
            System.out.println("The Computer chose " + randColor);


            //Conditions
            if (chosenColor.equals(randColor)){
                score = score + 1;
            } else {
                score = score + 0;
            }
            counter = counter + 1;
        }

        if (counter == 10){
            System.out.println("You got " + score + " our of 10 correct");
        }
        
    }
}
