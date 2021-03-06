package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */

class GenericExample2{
    public static <E extends Number> double sumArrayList(ArrayList<E> al){
        double sum = 0.0;

        for(int i = 0; i < al.size(); i++)
            sum += al.get(i).doubleValue();
        return sum;
    }
}

class GenericsControllerSum{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int x = 1;
        for(int i = 0; i <=10; i++){
            list.add(x++);
        }

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(1.2);
        list2.add(2.3);
        list2.add(3.4);

        GenericExample2 ge2 = new GenericExample2();
        System.out.println(ge2.sumArrayList(list));
        System.out.println(ge2.sumArrayList(list2));
    }
}