package Week5;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.jar.JarOutputStream;

import static javax.swing.JOptionPane.*;


public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File ("act10.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String land;
        String air;
        String sea;


        output.printf("%s %s %s\n", "Land", "Air", "Sea");
        for (int i = 1; i <=3; i++) {
            land = JOptionPane.showInputDialog(String.format("Enter your favorite land animal %d", i));
            air = JOptionPane.showInputDialog(String.format("Enter your favorite flying creature"));
            sea = JOptionPane.showInputDialog(String.format("Enter your favorite sea creature"));

            output.printf("%s %s %s\n", land, air, sea);
        }
        output.close();
    }
}
