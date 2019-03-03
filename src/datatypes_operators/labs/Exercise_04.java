package datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        int red = 10;
        int blue = 20;

        if (red > blue) {
            System.out.println("red is greater than blue");
        }
        else {
                System.out.println("false");
        }

        if (blue >= red) {
            System.out.println("blue is greater than or equal to red");
        }

        if (red < blue) {
            System.out.println("red is less than blue");
        }

        if (red <= blue) {
            System.out.println("red is less than or equal to blue");
        }

        if (red == blue) {
            System.out.println("red equals blue");
        }
        else {
            System.out.println("false");
        }


    }

}

