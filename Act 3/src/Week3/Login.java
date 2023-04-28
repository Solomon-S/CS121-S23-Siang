package Week3;
import static javax.swing.JOptionPane.*;
public class Login {
    public static void main(String[] args) {
        //Variables
        String userName = "Solo";
        String pass = "1121";
        String name;
        String pw;

        //Asking for input
        name = showInputDialog("Enter your username");
        pw = showInputDialog("Enter your password");

        //Conditions
        if (name.equals(userName) && pw.equals(pass))  {
            showMessageDialog(null,"Welcome to CS121");
        } else if (name.equals(userName) && pw != pass) {
            showMessageDialog(null,"Password Incorrect");
        } else if (name != userName && pw.equals(pass)) {
            showMessageDialog(null,"Username Incorrect");
        } else {
            showMessageDialog(null,"Username and Password Incorrect");        }
    }
}
