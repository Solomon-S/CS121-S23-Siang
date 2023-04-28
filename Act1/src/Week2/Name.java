package Week2;
import static javax.swing.JOptionPane.*;
//Assignment #1, Using Dialog Box
//Name:Solomon Siang
//Date:1/23/23
public class Name {
    public static void main(String[] args){
        //initializing
        String name;

        //Assigning
        name = showInputDialog("What is your name?");
        String input = name;
        StringBuilder input1 = new StringBuilder();

        //Reversing
        input1.append(input);
        input1.reverse();

        // Output
        showMessageDialog(null,String.format(name.toUpperCase()));
        showMessageDialog(null,String.format(name.toLowerCase()));
        showMessageDialog(null,input1);









    }
}
