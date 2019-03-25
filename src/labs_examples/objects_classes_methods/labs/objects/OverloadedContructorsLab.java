package labs_examples.objects_classes_methods.labs.objects;

/* For this exercise please create two classes. The first class is the controller and it will contain the main() method.
The second class is a POJO. Just a simple object type class that defines an object. In this POJO, demonstrate
at least three overloaded constructors. In the main() method, create at least 3 objects of your POJO class, each using
a different constructor. */

import java.sql.SQLOutput;

public class OverloadedContructorsLab {
    public static void main(String[] args) {

        Dog myDog = new Dog(false, "pointer", "female", 17);
        Dog myOtherDog = new Dog("mutt", "female", 13);
        Dog myNeighborsDog = new Dog ("labrador", "male");

        System.out.println("My dog is a purebred: " + myDog.pureBred + ". My dog is a " + myDog.age + " year-old "
                + myDog.gender + " " + myDog.breed + ".");
        System.out.println("My other dog is a " + myOtherDog.age + " year-old " + myOtherDog.gender + " " + myOtherDog.breed
        + ".");
        System.out.println("My neighbor's dog is a " + myNeighborsDog.gender + " " + myNeighborsDog.breed + ".");
    }
}

class Dog {
    boolean pureBred;
    String breed;
    String gender;
    int age;

    public Dog(boolean pureBred, String breed, String gender, int age) {
        this.pureBred = pureBred;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

    public Dog(String breed, String gender, int age) {
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

    public Dog(String breed, String gender) {
        this.breed = breed;
        this.gender = gender;
    }
}
