public class Main {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        int[] unsortedArray = sorting.getArray();
        System.out.println("Unsorted Array:");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + " ");
        }
        System.out.println();

        int[] sortedArray = sorting.sortArray(unsortedArray);
        System.out.println("Sorted Array:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}
