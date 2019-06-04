package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        int a = 4;
        int b = 0;

        try {
            int x = Math.floorDiv(a, b);
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Exception: can't divide by 0.");
        }
    }
}