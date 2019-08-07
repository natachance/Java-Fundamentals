package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */


class GenericsExample<T>{
    private T val1;
    private T val2;

    public GenericsExample(T value, T value2) {
        this.val1 = value;
        this.val2 = value2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }
}

class GenericsController{
    public static void main(String[] args) {
        GenericsExample<Integer> example1 = new GenericsExample(3, 5);
        GenericsExample<String> example2 = new GenericsExample("horse", "emu");
        GenericsExample<Double> example3 = new GenericsExample(2.6, 6.78);
    }
}