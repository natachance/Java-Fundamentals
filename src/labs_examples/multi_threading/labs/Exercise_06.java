package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

// look at TickTock example
// one class for odd and even printing methods
// one class to set up the threads
// once class to be controller with main method
// NEED TO FIGURE OUT LOGIC - use something like if (x % 2 == 0) for evens, and if (x % 2 != 0) for odds?
// or counter variable, x + 2?
// currently only running each method once, not looping around again in spite of for loops w/ counters

class OddEven {
    String state;
    static int x = 1;

    synchronized void odd (boolean running){
        if(!running){
            state = "odd";
            notify();
            return;
        }

        System.out.println(x);
        x++;
        state = "odd";
        notify();

        try {
            while (!state.equals("even")) {
                wait();
            }
        } catch (InterruptedException exc){
            System.out.println("Thread interrupted.");
            }
        }

        synchronized void even (boolean running){
            if(!running){
                state = "even";
                notify();
                return;
            }

            System.out.println(x);
            x++;

            state = "even";
            notify();

            try{
                while(!state.equals("odd")){
                    wait();
                }
            } catch (InterruptedException exc){
                System.out.println("Thread interrupted.");
            }
    }
}

class CountingThread implements Runnable {
    Thread t;
    OddEven oddEven;

    CountingThread (String name, OddEven oe){
        t = new Thread(this, name);
        oddEven = oe;
        t.start();
    }

    public void run(){
        if(t.getName().compareTo("odd") == 0) {
            for(int i = 0; i <= 100; i++)
                oddEven.odd(true);
                oddEven.odd(false);
        } else {
                for(int i = 0; i <= 100; i++)
                    oddEven.even(true);
                    oddEven.even(false);
        }
    }
}

class OddEvenController {
    public static void main(String[] args) {
        OddEven oe = new OddEven();
        CountingThread thread1 = new CountingThread("Thread 1", oe);
        CountingThread thread2 = new CountingThread("Thread 2", oe);

        try {
            thread1.t.join();
            thread2.t.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }

    }
}