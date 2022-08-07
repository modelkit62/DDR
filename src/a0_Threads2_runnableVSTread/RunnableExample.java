package a0_Threads2_runnableVSTread;

public class RunnableExample implements Runnable{
    @Override
    public void run (){
        System.out.println ("Runnable interface");
    }

    public static void main(String args[]) throws Exception {
        // Multiple threads share the same object.
        RunnableExample rc = new RunnableExample();
        Thread t1 = new Thread(rc);
        t1.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        Thread t2 = new Thread(rc);
        t2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        Thread t3 = new Thread(rc);
        t3.start();
    }
}
