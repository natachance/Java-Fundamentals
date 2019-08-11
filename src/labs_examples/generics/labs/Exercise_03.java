package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;

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

        System.out.println(ge3.genericSumMethod(1, 2.3));
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

    //#3 switch positions of 2 elements in an array
//    public static <E> E[] switchElements(E[] array){
//
//
//    }

    //#4 return largest element within range of a list
//    public static <E extends Number> E findLargest(E[] array){
//        E max;
//
////        return max;
//    }

}