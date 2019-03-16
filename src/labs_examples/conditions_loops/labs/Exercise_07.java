package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hint: there is a helpful method in the String class called charAt() that you'll want to use
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word (using all lowercase letters): ");

        String word = scanner.nextLine();

        char letter;
        if (word != null){
            letter = word.charAt(0);
        } else {
            System.out.println("error");
            return;
        }
        int letterNumber = 0;

       while (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') {
           letter = word.charAt(letterNumber);
           letterNumber++;
        }

       System.out.println("The first vowel in " + word + " is " + letter);
    }
}
