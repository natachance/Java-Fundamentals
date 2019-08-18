package labs_examples.lambdas.labs;

import java.util.function.BiFunction;

/**
 * Lambdas Exercise 3:
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 */

class MethodReferenceExamples {
    public static void main(String[] args) {
        //#1 static method reference
        BiFunction<Integer, Integer, Integer> f = MethodReferenceExamples :: additionMethod;
        int x = f.apply(10, 2);
        System.out.println(x);

        //#2 instance method reference
        MethodReferenceExamples object = new MethodReferenceExamples();
        SampleInterface sample = object :: printTextMethod;
        sample.sampleMethod();

        ExampleInterface example = object :: mathMethod;
        System.out.println(example.exampleMethod(2, 4));

        //#3 constructor reference
        BookCreator bc = Book :: new;
        Book julie = bc.createBook("Julie", "Rousseau", 123);
        Book snow = bc.createBook("Snow", "Pamuk", 134);
        System.out.println(julie.toString());
        System.out.println(snow.toString());
    }

    public static int additionMethod(int a, int b){
        return a + b;
    }

    public void printTextMethod(){
        System.out.println("Printing text example");
    }

    public int mathMethod(int a, int b){
            return a * b;
        }
}

@FunctionalInterface
interface SampleInterface {
    public void sampleMethod();
}

@FunctionalInterface
interface ExampleInterface {
    public int exampleMethod(int a, int b);
}

@FunctionalInterface
interface BookCreator {
    Book createBook(String title, String author, int refNum);
}

class Book {
    String title;
    String author;
    int refNum;

    public Book(String title, String author, int refNum) {
        this.title = title;
        this.author = author;
        this.refNum = refNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRefNum() {
        return refNum;
    }

    public void setRefNum(int refNum) {
        this.refNum = refNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", refNum=" + refNum +
                '}';
    }
}



