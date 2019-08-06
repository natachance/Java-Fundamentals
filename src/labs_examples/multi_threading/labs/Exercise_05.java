package labs_examples.multi_threading.labs;

import java.io.IOException;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class Exercise_05 {
    public static void main(String[] args) {
        PrintMessages pm = new PrintMessages();
        pm.printMessages("This is a message.");
    }
}

class PrintMessages {
    boolean print = true;
    String message;

    public synchronized void printMessages(String message){
        while (!print) {
            try {
                System.out.println(message);
                wait();
            } catch (InterruptedException ie) {
                ie.getMessage();
            }
        }
        print = false;
        this.message = message;
        notify();
    }
}