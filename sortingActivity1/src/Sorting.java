import java.util.Scanner;

public class Sorting {

    public int[] getArray() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 unsorted integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
