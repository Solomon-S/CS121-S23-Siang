package Week5;
import javax.xml.transform.SourceLocator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile1 = new File("act10.txt");


        try {
            Scanner input = new Scanner(inputFile1);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
