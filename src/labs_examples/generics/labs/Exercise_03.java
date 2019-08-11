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
        System.out.println(ge3.genericSumMethod(1, 2.3));

        //#2 creating ArrayList to pass in, then checking output


        //#3 creating array to pass in, switching elements in the array, then checking output
        Integer[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] updatedTestArray = ge3.switchElements(testArray, 3, 5);
        for(int i = 0; i < updatedTestArray.length; i++) {
            System.out.print(updatedTestArray[i]+ " ");
        }

        // #4 testing output, return largest element in list
        int x = ge3.findLargest(testArray);
        System.out.println(x);
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
    public static <E extends Collection> int palindromStrings(E list){
        int numberOfStrings = 0;



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

    //#4 return largest element within range of a list
    public static <E extends Number> E findLargest(E[] array){
        E max;

        return max;
    }

}