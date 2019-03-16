package labs_examples.arrays.labs;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */


import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 numbers, with a space between each number");

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;

        for(int i : numbers){
            sum += i;
        }

        System.out.println("The sum of the numbers entered is " + sum + ".");

        double average = 0;

        average = sum/10.0;

        System.out.println("The average of the numbers entered is " + average + ".");
    }
}