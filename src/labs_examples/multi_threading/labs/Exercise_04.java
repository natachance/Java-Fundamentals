package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */


class Exercise_04 {
    public static void main(String[] args) {
        PrintMessage pm = new PrintMessage();
        pm.print("This is a message.");

        PrintMessage2 pm2 = new PrintMessage2();
        ThreadedPrint t = new ThreadedPrint("This is another message.", pm2);
        ThreadedPrint t2 = new ThreadedPrint("This is yet another message.", pm2);
        t.start();
        t2.start();
    }
}

class PrintMessage {
    public synchronized void print(String message){
        System.out.println(message);
    }
}

class PrintMessage2 {
    public void print(String message){
        System.out.println(message);
    }
}

class ThreadedPrint extends Thread {
    private String msg;
    private Thread thread;
    PrintMessage2 pm2;

    ThreadedPrint(String message, PrintMessage2 object){
        msg = message;
        pm2 = object;
    }

    public void run(){
        synchronized (pm2){
            pm2.print(msg);
        }
    }
}

