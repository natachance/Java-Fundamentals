package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        try {
            sampleMethodFour(1, 3);
        } catch(ArithmeticException e){
            System.out.println("error: you can't divide by 0");
        }
    }

    public static void sampleMethodFour(int a, int b) throws ArithmeticException {
            int[] nums = {3, 6, 9, 0};

            int x = nums[a] / nums [b];
            System.out.println(x);
    }
}