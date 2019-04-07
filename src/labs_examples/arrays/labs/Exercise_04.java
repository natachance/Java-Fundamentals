package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        int[][] irregular = {
                {2, 4, 6},
                {1, 3},
                {5, 7, 9, 11},
            };

        for(int i = 0; i < irregular.length; i++){
            for(int j = 0; j < irregular[i].length; j++){
                System.out.print(irregular[i][j] + " ");
            }
            System.out.println();
        }
    }
}
