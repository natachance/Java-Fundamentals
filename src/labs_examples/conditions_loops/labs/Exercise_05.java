package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 */

// sum = (upperNumber(upperNumber + lowerNumber))/2

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a larger number and press return. Then enter a smaller number and press return again: ");

        int upperNumber = scanner.nextInt();
        int lowerNumber = scanner.nextInt();
        int lowerNumberHold = lowerNumber;
        int sum = 0;

        for(; lowerNumber <= upperNumber; lowerNumber++){
            sum += lowerNumber;
        }
        System.out.println("The sum of your numbers = " + sum);

        double average = (upperNumber + lowerNumberHold) / 2.0;

        System.out.println("The average = " + average);
    }
}
