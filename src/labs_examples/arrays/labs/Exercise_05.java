package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int[] backwards = new int[5];
        int val = 1;

        for(int i = 0; i < backwards.length; i++){
            backwards[i] = val;
            val++;
        }

        for(int i = backwards.length - 1; i >= 0; i -= 2){
            System.out.print(backwards[i] + " ");
        }
    }
}
