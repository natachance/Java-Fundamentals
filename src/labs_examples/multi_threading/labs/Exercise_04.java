package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class PrintMessage {
    public void printMessage(String message){
        System.out.println(message);
    }
}

class ThreadedPrintMessage extends Thread {
    private String message;
    private Thread thread;
    PrintMessage printMessage;

    public void ThreadedPrint(String message, PrintMessage object){
        message = message;
        object = object;
    }

    public void run(){
        synchronized (printMessage){}
    }
}

