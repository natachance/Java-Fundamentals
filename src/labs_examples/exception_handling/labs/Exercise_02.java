package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *      Demonstrate a try/catch with multiple catch statements.
 */


public class Exercise_02 {
    public static void main(String[] args) {
    sampleMethod(1, 2);
    sampleMethod(1, 3);
    sampleMethod(2, 8);

    }

    public static void sampleMethod (int a, int b) {
        int[] nums = {3, 6, 9, 0};
        try {
            int x = nums[a] / nums [b];
            System.out.println(x);
        } catch (ArithmeticException exc){
            System.out.println("Error - you can't divide by 0.");
        } catch (ArrayIndexOutOfBoundsException exc2){
            System.out.println("Error - index does not exist in this array.");
        }
    }
}