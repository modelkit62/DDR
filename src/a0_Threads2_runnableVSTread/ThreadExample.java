package a0_Threads2_runnableVSTread;

public class ThreadExample extends Thread {
    private int counter = 0;
    public void run() {
        counter++;
        System.out.println("ExtendsThread : Counter : " + counter);
    }

    public static void main(String args[]) throws Exception {
        // Creating new instance for every thread access.
        ThreadExample tc1 = new ThreadExample();
        tc1.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        ThreadExample tc2 = new ThreadExample();
        tc2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        ThreadExample tc3 = new ThreadExample();
        tc3.start();
    }
}
