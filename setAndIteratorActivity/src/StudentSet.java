import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentSet {

    private Set<String> students;

    public StudentSet() {
        students = new HashSet<>();
    }

    public void addStudents() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a student name or q to quit: ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            } else {
                students.add(input);
            }
        }
    }

    public void displayStudents() {
        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
