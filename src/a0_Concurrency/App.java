package a0_Concurrency;

class Counter{
    int value;
    public synchronized void increment(){
        value++;
    }

    public int getValue() {
        return value;
    }
}

public class App {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        System.out.println("Counter value: " + counter.getValue());

        Thread thread_1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        });
        Thread thread_2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        });
        thread_1.start();
        thread_2.start();
        Thread.sleep(10);

        System.out.println("Counter value: " + counter.getValue());
    }
}
