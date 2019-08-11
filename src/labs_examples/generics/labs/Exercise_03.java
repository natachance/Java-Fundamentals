package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a collection of Strings that are palindromes
 *
 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 */

class GenericsExercise3Controller{
    public static void main(String[] args) {
        GenericsExercise3 ge3 = new GenericsExercise3();

        // #1 checking output - sum of two numbers (of any type)
        System.out.println("The sum is: " + ge3.genericSumMethod(1, 2.3));

        //#2 creating ArrayList to pass in, then checking output
        ArrayList<String> palindromes = new ArrayList();
        palindromes.add("kayak");
        palindromes.add("racecar");
        palindromes.add("greyhound");
        int numOfPalindromes = ge3.palindromeStrings(palindromes);
        System.out.println("There are " + numOfPalindromes + " palindromes.");

        //#3 creating array to pass in, switching elements in the array, then checking output
        Integer[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] updatedTestArray = ge3.switchElements(testArray, 3, 5);
        System.out.print("The updated array is: ");
        for(int i = 0; i < updatedTestArray.length; i++) {
            System.out.print(updatedTestArray[i]+ " ");
        }
        System.out.println();

        // #4 testing output, return largest element in list
        int x = ge3.findLargest(testArray);
        System.out.println("The largest element is: " + x);
    }
}

class GenericsExercise3{
    //#1 return sum of 2 arguments as a double
    public static <T extends Number, U extends Number> Double genericSumMethod(T t, U u){
        Double sum = 0.0;
        sum = t.doubleValue() + u.doubleValue();
        return sum;
    }

    //#2 count and return number of palindromes in collection of Strings
    public static <E extends Collection> int palindromeStrings(E list){
        int numberOfStrings = 0;

        for(int i = 0; i < list.size(); i++){
            String temp = (String) list.toArray()[i];
            String reverse = new StringBuffer(temp).reverse().toString();

            // check whether the string is palindrome or not
            if (temp.equals(reverse)){
                numberOfStrings += 1;
            }
        }
        return numberOfStrings;
    }

//    #3 switch positions of 2 elements in an array
    public static <E> E[] switchElements(E[] array, int index1, int index2){
        E temp1 = array[index1];
        E temp2 = array[index2];

        array[index1] = temp2;
        array[index2] = temp1;

        return array;
    }

//    #4 return largest element within range of a list
    public static <E extends Comparable> E findLargest(E[] array){
        E max = array[0];

        for(int i = 0; i < array.length - 1; i++){
            if (array[i + 1].compareTo(array[i]) > 0){
                max = array[i + 1];
            }
        }
        return max;
    }
}