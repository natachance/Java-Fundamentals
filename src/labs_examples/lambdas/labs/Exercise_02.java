package labs_examples.lambdas.labs;

import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 */

class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bipredicate = (x, y) -> x > y;
        System.out.println("Bipredicate: " + bipredicate.test(1, 2));

        BiFunction<Double, Double, Double> bifunction = (x, y) -> x * y;
        System.out.println("Bifunction: " + bifunction.apply(5.5, 6.7));

        Comparable<String> comparable = (s) -> s.compareTo("Another string");
        System.out.println("Comparable: " + comparable.compareTo("Another string"));

        Runnable r = () -> {
            System.out.println("New runnable");
        };
        Thread t = new Thread(r);
        t.start();

        BinaryOperator<Integer> binaryoperator = (x, y) -> x * y;
        System.out.println("Binary operator: " + binaryoperator.apply(2, 3));

        Supplier<String> supplier = () -> "Supplier string";
        System.out.println("Supplier: " + supplier.get());

        UnaryOperator<Double> unaryoperator = (x) -> x * 2;
        System.out.println("UnaryOperator: " + unaryoperator.apply(2.5));

        DoubleToIntFunction doubletoint = x -> (int) x;
        System.out.println("Double to int: " + doubletoint.applyAsInt(1.7));

        DoubleBinaryOperator doublebinaryoperator = (x, y) -> x + y;
        System.out.println("DoubleBinaryOperator: " + doublebinaryoperator.applyAsDouble(2.5, 6.9));

        IntSupplier intsupplier = () -> (int) 3.5;
        System.out.println("IntSupplier: " + intsupplier.getAsInt());
    }
}