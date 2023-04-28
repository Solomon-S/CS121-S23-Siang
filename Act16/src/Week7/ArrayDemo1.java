package Week7;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // Initializing 4D array using method 1
        int[][][][] arr1 = new int[2][3][4][3];
        arr1[0][0][0][0] = 1;
        arr1[0][0][0][1] = 2;
        arr1[0][0][0][2] = 3;
        arr1[1][2][3][0] = 4;
        arr1[1][2][3][1] = 5;
        arr1[1][2][3][2] = 6;


        // Printing array elements using for-each loop
        System.out.println("Printing arr1 using for-each loop:");
        for (int[][][] a : arr1) {
            for (int[][] b : a) {
                for (int[] c : b) {
                    for (int d : c) {
                        System.out.print(d + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}

