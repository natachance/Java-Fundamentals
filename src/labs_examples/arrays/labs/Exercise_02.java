package labs_examples.arrays.labs;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 */

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10.");

        int input = scanner.nextInt();

        for(int index = 0; index < array.length; index++){
            if (array[index] == input){
                System.out.println("The index of " + input + " is " + index);
                break;
            }
        }
    }
}