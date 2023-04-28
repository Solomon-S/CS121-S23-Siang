package Week7;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // Initializing 4D array using method 2
        int[][][][] arr2 = {{{{7, 8, 9}, {10, 11, 12}, {13, 14, 15}, {16, 17, 18}}},
                {{{19, 20, 21}, {22, 23, 24}, {25, 26, 27}, {28, 29, 30}}}};

        System.out.println("Printing arr2 using regular for loop:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                for (int k = 0; k < arr2[i][j].length; k++) {
                    for (int l = 0; l < arr2[i][j][k].length; l++) {
                        System.out.print(arr2[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}




