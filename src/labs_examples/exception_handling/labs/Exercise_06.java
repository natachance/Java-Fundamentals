package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        try {
            Exercise_05.sampleMethodFour(1, 3);
        } catch(ArithmeticException e){
            System.out.println("error: you can't divide by 0");
        }
    }
}