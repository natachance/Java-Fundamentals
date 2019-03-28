package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("a * b = " + multiply(2,4));
        System.out.println("a / b = " + divide(8, 4));
        joke("rebel");
        System.out.println(secondsInYears(33) + " seconds");
        System.out.println(numberOfArgs("one", "two", "three", "four") + " args");

    }

    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        int multiplyTotal = a * b;
        return multiplyTotal;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        int divideTotal = a / b;
        return divideTotal;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(String j){
        System.out.println("That elephant looks like a " + j + "!");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int secondsInYears(int y){
        int seconds = y * 31536000;
        return seconds;
    }
    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int numberOfArgs(String...args){
        int counter = 0;
        for (String a : args){
            counter++;
        }
        return counter;
    }
}
