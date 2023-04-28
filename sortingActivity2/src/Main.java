public class Main {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        // Get unsorted array
        int[] unsortedArray = sorting.getArray();

        // Print unsorted array
        System.out.println("Unsorted array:");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + " ");
        }
        System.out.println();

        // Sort array
        int[] sortedArray = sorting.sortArray(unsortedArray);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }
}
