package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07{
    public static void main(String[] args) {
        Bus bus = new Bus();
        BusRider rider = new BusRider("Bob", 65);

        try {
            bus.buyBusTicket(rider);
        } catch (busFullException){
            System.out.println("Bus is full, no more tickets available.");
        }
    }

    public void buyBusTicket(BusRider busRider) throws busFullException {
        if (bus.getPassengers().size() < 40) {
            bus.getPassengers().add(busRider);
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


}
