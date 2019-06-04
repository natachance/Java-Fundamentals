package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */


public class Exercise_03 {
    public static void main(String[] args) {
        sampleMethodTwo(1, 2);
        sampleMethodTwo(1, 3);
        sampleMethodTwo(2, 9);
    }

        public static void sampleMethodTwo ( int a, int b){
            int[] nums = {3, 6, 9, 0};
            try {
                int x = nums[a] / nums[b];
                System.out.println(x);
            } catch (ArithmeticException exc) {
                System.out.println("Error - you can't divide by 0.");
            } catch (ArrayIndexOutOfBoundsException exc2) {
                System.out.println("Error - index does not exist in this array.");
            } finally {
                System.out.println("End of program.");
            }
        }
}