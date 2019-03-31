package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *      This is a very common interview challenge. BUT NO PRESSURE.
 *
 *      Using a for loop, please demonstrate how to reverse an array in place using only one extra variable. Please note,
 *      you cannot use a second array and you can only instantiate one variable outside of the for loop.
 */
public class Exercise_06 {
    public static void main(String[] args) {

        //creating an array
        int[] data = new int[5];
        int val = 0;

        System.out.println("Original array: ");

        //populating the array
        for(int i = 0; i < data.length; i++) {
            data[i] = val;
            val++;
            System.out.print(data[i] + " ");
        }

        System.out.println();
        System.out.println("Reversed array: ");

        //reversing the array in place
        for(int i = 0; i < data.length / 2; i++ ){
            int temp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = temp;
            }

        //printing the reversed array
        for(int k = 0; k < data.length; k++){
            System.out.print(data[k] + " ");
        }
//        for(int i = data.length - 1; i >= 0; i--) {
//            System.out.print(data[i] + " ");
//        }
    }
}
