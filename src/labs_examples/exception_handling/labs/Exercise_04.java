package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *      Demonstrate a nested try/catch.
 */

public class Exercise_04 {
    public static void main(String[] args) {
        demoMethodThree(6, 2);
        System.out.println();

        demoMethodThree(2, 3);
        System.out.println();
    }

    public static void demoMethodThree(int a, int b){
        int[] nums = {3, 6, 9, 0};
        try {
            int x = nums[a];
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException exc1) {
            System.out.println("The index entered does not exist in this array.");
            try {
                int y = nums [b] / 0;
                System.out.println(y);
            } catch (ArithmeticException exc2) {
                System.out.println("Error: can't divide by 0.");
            }
        }
    }
}