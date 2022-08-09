package a0_Threads1_synchronized;

public class MyRunnable {

    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Running Thread 1");
        new Thread(r1).start();
    }
}
