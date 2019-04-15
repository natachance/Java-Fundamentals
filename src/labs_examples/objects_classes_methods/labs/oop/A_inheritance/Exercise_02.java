package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 * "10" prints because i in class B is redundant (since i in A is public, B will access and use i as its own variable)?
 * Or because there's no constructor, it only has access to A becuase that's the class named first?
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
    int j = 5;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}