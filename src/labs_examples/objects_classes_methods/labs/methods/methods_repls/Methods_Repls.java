package labs_examples.objects_classes_methods.labs.methods.methods_repls;
/* please write the four methods as instructed below, then call each method from here within the main()

   please write a static multiply() method below that takes two parameters (argumets) and returns the result of
   multiplying them together.

   please write a static divide() method below that takes two parameters (argumets) and returns the result of
   dividing the first parameter by the second parameters

   please write a static isOdd() method that takes one numeric parameter and returns a true (boolean) if the
   parameter is odd

   please write a method that will take in a String (as an argument) and return that String in reverse order.
   For instance, if you pass in the String "programming is cool" the method will return the String "looc si gnimmargorp"
*/

public class Methods_Repls {

    public static void main(String[] args) {

        int x = multiply(2,3);
        int y = divide(6,2);
        boolean z = isOdd(1);
        String phrase = reverseString("programming is cool");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(phrase);
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

    public static boolean isOdd(int a){
        if(a % 2 != 0){
            return true;
        } else {
            return false;
        }
    }

    public static String reverseString(String phrase){

        char letter;
        String reverse = "";

        for(int index = phrase.length() - 1; index >= 0; index--){
            letter = phrase.charAt(index);
            reverse = reverse + letter;
        }
        return reverse;
    }
}