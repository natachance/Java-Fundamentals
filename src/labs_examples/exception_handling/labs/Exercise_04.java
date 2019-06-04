package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *      Demonstrate a nested try/catch.
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int a;
        int b;

        try {
            int x = Math.floorDiv(a, b);
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Error: can't divide by 0.");

            try {

            }
        }
    }
}