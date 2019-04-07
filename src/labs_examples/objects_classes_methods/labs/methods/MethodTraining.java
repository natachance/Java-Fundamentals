package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 25;
        int f = 37;

        double d = 12.5;
        double e = 20.3;

        int[] testArray1 = new int[10];
        for(int i = 0; i < testArray1.length; i++){
            testArray1[i] = i + 1;
        }
        int[] testArray2 = {47, 39, 50, 58, 2, 74, 28};
        int[] testArray3 = {34, 1, 58, 59, 20, 60, 28, 33, 79};

//      1. demonstrating method overloading
        System.out.println("Demonstrating method overloading: ");
        System.out.println("Addition of ints a, b: " + addition(a, b));
        System.out.println("Addition of ints a, b, c: " + addition(a, b, c));
        System.out.println("Addition of doubles d, e: " + addition(d, e));
        System.out.println();

//      2a. demonstrating pass by value
        System.out.println("Demonstrating pass by value:");
        System.out.println("Original a and b: " + a + ", " + b);
        passByValue(a, b);
        System.out.println("After passByValue method a and b: " + a + ", " + b);
        System.out.println();

//      2b. demonstrating pass by reference
        System.out.println("Demonstrating pass by reference:");
        Trip myTrip = new Trip(true, "Egypt", 12);
        System.out.println("Original trip: custom? " + myTrip.custom + ", country: " + myTrip.countryName + ", length: "
                + myTrip.numberOfDays + " days.");
        addDaysToTrip(myTrip);
        System.out.println("Trip after addDaysToTrip method: custom? " + myTrip.custom + ", country: "
                + myTrip.countryName + ", length: " + myTrip.numberOfDays + " days.");
        System.out.println();

//      3. returning largest of 4 numbers
        System.out.println("The largest of the 4 numbers entered is: " + largestNumber(a, b, c, f));
        System.out.println();

//      4. counting all consonants
        System.out.println("The number of consonants is: " + numberOfConsonants("alphabet"));
        System.out.println();

//      5. printing ASCII art
        printTree();
        System.out.println();

//      6. determining if number is prime
        System.out.println(f + " is prime: " + isNumberPrime(f));
        System.out.println(c + " is prime: " + isNumberPrime(c));
        System.out.println(a + " is prime: " + isNumberPrime(a));
        System.out.println();

//      7a. setting up arrays and showing values
        System.out.println("Values in testArray1: ");
        for(int index = 0; index < testArray1.length; index++){
            System.out.print(testArray1[index] + ", ");
        }
        System.out.println();
        System.out.println("Values in testArray2: ");
        for(int index = 0; index < testArray2.length; index++) {
            System.out.print(testArray2[index] + ", ");
        }
        System.out.println();
        System.out.println("Values in testArray3: ");
        for(int index = 0; index < testArray3.length; index++) {
            System.out.print(testArray3[index] + ", ");
        }
        System.out.println();
        System.out.println();

//      7b. returning highest and lowest number in an array
        int[] returnArray1 = lowHighNumbers(testArray1);
        int[] returnArray2 = lowHighNumbers(testArray2);
        int[] returnArray3 = lowHighNumbers(testArray3);
        System.out.println("The highest and lowest numbers in array 1 are: " + returnArray1[0] + " and " + returnArray1[1]);
        System.out.println("The highest and lowest numbers in array 2 are: " + returnArray2[0] + " and " + returnArray2[1]);
        System.out.println("The highest and lowest numbers in array 3 are: " + returnArray3[0] + " and " + returnArray3[1]);
        System.out.println();

//      8. returning an ArrayList
        ArrayList<Integer> returnedIntList = returnArrayList(100, 2, 6);
        System.out.println("Values in returned array list are: " + returnedIntList);
        System.out.println("There are " + returnedIntList.size() + " elements in the above ArrayList.");
        System.out.println();

//      9. reversing an array in place
        int[] returnedArray = reverseArray(testArray1);
        System.out.println("The array in reverse is: ");
        for(int count = 0; count < returnedArray.length; count++){
            System.out.print(returnedArray[count] + " ");
        }
    }

    // 1. demonstrating method overloading
        public static int addition ( int a, int b){
            int total = a + b;
            return total;
        }

        public static int addition ( int a, int b, int c){
            int total = a + b + c;
            return total;
        }

        public static double addition ( double a, double b){
            double total = a + b;
            return total;
        }

    // 2. demonstrating pass by value
        public static void passByValue(int a, int b){
            a = a + 10;
            b = b + 10;
            System.out.println("Within passByValue a and b: " + a + ", " + b);
        }

//      demonstrating pass by reference
    public static void addDaysToTrip(Trip trip){
        trip.numberOfDays = trip.numberOfDays+ 3;
    }

//    3) returning the largest of 4 numbers
    public static int largestNumber(int a, int b, int c, int d){
        if(a > b && a > c && a > d){
            return a;
        } else if (b > c && b > d){
            return b;
        } else if (c > d){
            return c;
        } else {
            return d;
        }
    }

//    4) Write a method to count all consonants (the opposite of vowels) in a String
        public static int numberOfConsonants(String a){
        int sum = 0;
        for(int i = 0; i < a.length(); i++){
            char letter = a.charAt(i);
            if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') {
                sum++;
            }
        }
        return sum;
        }

//    5) printing ascii art
        public static void printTree(){
            System.out.println("    *  ");
            System.out.println("   *** ");
            System.out.println("  ***** ");
            System.out.println(" ******* ");
            System.out.println("    *  ");
            System.out.println("    *  ");
            System.out.println("----------");
        }

//    6) determining if a number is prime
    public static boolean isNumberPrime(int a){
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

//    7) returning highest and lowest numbers in an array, as an array
    public static int[] lowHighNumbers(int[] array){
        int high = array[0];
        int low = array[0];

        for (int i = 0; i < array.length; i++){
            if(array[i] < low){
                low = array[i];
            }
            if(array[i] > high){
                high = array[i];
            }
        }

        int[] returnArray = {high, low};
        return returnArray;
    }

//    8) returning a populated array list
    public static ArrayList<Integer> returnArrayList(int maxNum, int divisor1, int divisor2){

       ArrayList<Integer> intList = new ArrayList<>();

       for(int i = 1; i <=maxNum; i++) {
           if(i % divisor1 == 0 && i % divisor2 == 0) {
               intList.add(i);
           }
       }
       return intList;
    }

//    9) reversing an array in place
        public static int[] reverseArray(int [] array){
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}

//building Trip object to use in pass by reference example
class Trip{

    boolean custom;
    String countryName;
    int numberOfDays;

    public Trip(boolean custom, String countryName, int numberOfDays){
        this.custom = custom;
        this.countryName = countryName;
        this.numberOfDays = numberOfDays;
    }
}