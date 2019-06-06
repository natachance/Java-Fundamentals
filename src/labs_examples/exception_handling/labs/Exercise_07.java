package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07{
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Exercise_07 run = new Exercise_07();
        Bus bus = new Bus();

        boolean addingRiders = true;
        while (addingRiders) {
            BusRider rider = run.initializeRider();
            try {
                run.buyBusTicket(bus, rider);
            } catch (busFullException e){
                System.out.println("Sorry, the bus is full, no more tickets available.");
                break;
            }
        }
    }

    public void buyBusTicket(Bus bus, BusRider rider) throws busFullException {
        if (bus.getPassengers().size() < 12) {
            bus.getPassengers().add(rider);
            System.out.println("Good news, we have a ticket available for you!");
                if (rider.getAge() >= 65){
                    System.out.println("You qualify for a senior citizen discount.");
                    System.out.println();
                } else {
                    System.out.println("You are purchasing a full price ticket.");
                    System.out.println();
                }
        } else {
            throw new busFullException();
        }
    }

    public class busFullException extends Exception {
        @Override
        public String toString() {
            return "Bus at capacity";
        }
    }

    public BusRider initializeRider () {
        System.out.println("Hello and welcome to the bus! What is your name?");
        String name = scanner.next();

        System.out.println("And what is your age?");
        int age = scanner.nextInt();

        BusRider rider = new BusRider(name, age);
        return rider;
    }
}
