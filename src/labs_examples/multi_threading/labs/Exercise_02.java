package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class ThreadsLabTwo {
    public static void main(String[] args) {
        LabTwo example = new LabTwo("Example");
        example.setPriority(1);

        LabTwo example2 = new LabTwo("Example two");
        example2.setPriority(Thread.MAX_PRIORITY);
    }
}

class LabTwo extends Thread {
        public LabTwo (String name) {
            super(name);
            start();
        }

        @Override
        public void run(){
            System.out.println("This is thread: " + getName());
        }
    }