package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<String> dogs = new ArrayList();

        dogs.add("pointer");
        dogs.add("terrier");
        dogs.add("poodle");
        dogs.add("boxer");
        dogs.add("bloodhound");

        System.out.println("The dog at index 2 is " + dogs.get(2));
        System.out.println("The index of boxer is " + dogs.indexOf("boxer"));

        System.out.println("Adding dog dachshund");
        dogs.add("dachshund");
        System.out.println("Removing dog " + dogs.remove(2));
        System.out.println("Now list contains " + dogs);

        System.out.println("There are " + dogs.size() + " elements in this list.");
    }
}
