import java.util.Scanner;

public class Sorting {

    public int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 unsorted integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public int[] sortArray(int[] arr) {
        // Selection sort algorithm
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
