package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class ThreadsLabOne {
    public static void main(String[]args){
        LabOne exampleOne = new LabOne("Example one");

        OtherLabOne exampleTwo = new OtherLabOne();
        Thread t = new Thread(exampleTwo, "Example Two");
        t.start();
    }
}

class LabOne implements Runnable {
    Thread thread;
    public LabOne (String name){
      thread = new Thread(this, name);
      thread.start();
    }
    @Override
    public void run(){
            System.out.println("This is thread: " + thread.getName());
    }
}

class OtherLabOne implements Runnable{

    @Override
    public void run(){
        System.out.println("This is thread " + Thread.currentThread().getName());
    }
}