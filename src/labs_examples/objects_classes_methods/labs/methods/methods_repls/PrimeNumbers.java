package labs_examples.objects_classes_methods.labs.methods.methods_repls;

public class PrimeNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 25;
        int f = 37;

        System.out.println(f + " is prime: " + isNumberPrime(f));
        System.out.println(c + " is prime: " + isNumberPrime(c));
        System.out.println(a + " is prime: " + isNumberPrime(a));
        System.out.println(b + " is prime: " + isNumberPrime(b));
    }

    public static boolean isNumberPrime(int a){
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}
