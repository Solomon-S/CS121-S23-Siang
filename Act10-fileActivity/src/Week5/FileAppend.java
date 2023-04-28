package Week5;
import javax.swing.*;
import java.io.*;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("act10.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String land = JOptionPane.showInputDialog(String.format("Enter your favorite land animal"));
            String air = JOptionPane.showInputDialog(String.format("Enter your favorite flying creature"));
            String sea = JOptionPane.showInputDialog(String.format("Enter your favorite sea creature"));

            output.printf("%s %s %s\n", land, air, sea);
            fileWriter.close();
            output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}
