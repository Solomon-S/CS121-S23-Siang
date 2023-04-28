package Week7;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // Initializing 2D array of strings
        String[][] arr = {{"Solomon", "Siang", "19"}, {"Johnny", "Applesmith", "28"}, {"Bob", "Smith", "50"}};

        // Printing array elements using for-each loop
        System.out.println("Printing arr using for-each loop:");
        for (String[] a : arr) {
            for (String s : a) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
