package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        boolean red = true;
        boolean blue = false;

        if (red & blue) {
            System.out.println("red and blue");
        }
        else {
            System.out.println("false");
        }

        if (red && blue) {
            System.out.println("if red, then red and blue");
        }
        else {
            System.out.println("false");
        }

        if (red | blue) {
            System.out.println("red or blue or both");
        }

        if (red || blue) {
            System.out.println("if red, then red or blue or both");
        }

        if (red ^ blue) {
            System.out.println("red or blue, but not both");
        }

        if (!red) {
            System.out.println("not red");
        }
        else {
            System.out.println("red");
        }

    }

}

