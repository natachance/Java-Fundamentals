package labs_examples.lambdas.labs;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */

class LambdaExercise1 {
    //#1 create functional interface w/ void abstract method
    interface ExampleInterface {
        public void abstractMethod();
    }

    //#3 functional interface with method taking 1 parameter, returning a value
    interface ExampleInterface2 {
        public int abstractMethodInt(int x);
    }

    //#5 functional interface taking in 2 parameters, returning a value
    interface ExampleInterface3<V> {
        public V anotherAbstractMethod(V x, V y);
    }

    public static void main(String[] args) {
        //#2 lambda expression and anonymous inner class with 1st interface
        ExampleInterface ex = () -> System.out.println("Lambda example from first ExampleInterface");
        ex.abstractMethod();

        ExampleInterface ex2 = new ExampleInterface() {
            @Override
            public void abstractMethod() {
                System.out.println("Anonymous inner class from first ExampleInterface");
            }
        };
        ex2.abstractMethod();

        //#4 lambda expression and anonymous inner class with 2nd interface
        ExampleInterface2 ex3 = (int x) -> x * 2;
        System.out.println("Result from lambda expression using ExampleInterface2: " + ex3.abstractMethodInt(2));

        ExampleInterface2 ex4 = new ExampleInterface2() {
            @Override
            public int abstractMethodInt(int x) {
                return x * 2;
            }
        };
        System.out.println("Result from anonymous inner class using ExampleInterface2: " + ex4.abstractMethodInt(2));

        //#6 lambda expression and anonymous inner class with 3rd interface
        ExampleInterface3<Integer> ex5 = (x, y) -> x + y;
        System.out.println("Result from lambda expression using ExampleInterface3: " + ex5.anotherAbstractMethod(2, 4));

        ExampleInterface3<Integer> ex6 = new ExampleInterface3<Integer>() {
            @Override
            public Integer anotherAbstractMethod(Integer x, Integer y) {
                return x + y;
            }
        };
        System.out.println("Result from anonymous inner class using ExampleInterface3: " + ex6.anotherAbstractMethod(2, 4));

        //#7 demonstrate 2 built-in functional interfaces
        Predicate<Double> predicate = (x) -> x > 10;
        System.out.println("Predicate result: " + predicate.test(2.5));

        Function<Double, Double> function = (x) -> x * x;
        System.out.println("Function result: " + function.apply(5.5));
    }
}