package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class Exercise_05 {
    public static void main(String[] args) {
    PrintMessages pm = new PrintMessages();
    pm.printMessages();
    }
}

class PrintMessages {
    public void printMessages(){
        boolean print = true;
        while (!print) {
            try {
                System.out.println("Printing first message.");
                wait();
                System.out.println("Printing second message.");
            } catch (InterruptedException ie) {
                ie.getMessage();
            }
        }
        print = false;
        notify();
    }
}