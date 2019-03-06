package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        // V=πr^2h

        double radius; // holds value of radius of cylinder
        double height; // holds value of height of cylinder
        double volume; // holds value of volume of cylinder

        radius = 3.14;

        height = 5;

        volume = Math.PI * Math.pow(radius, 2) * height; // calculate volume of cylinder

        System.out.println("The volume of a cylinder with a radius of " + radius + " and height of " + height + " equals " + volume + ".");
    }
}
