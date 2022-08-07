package a0_Threads2_runnableVSTread;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.logging.Logger;

class SimpleThread extends Thread {

    private static final Logger log = (Logger) LoggerFactory.getLogger(SimpleThread.class);

    private String message;

    SimpleThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        log.info(message);
    }

    @Test
    public void givenAThread_whenRunIt_thenResult() throws Exception {

        Thread thread = new SimpleThread("SimpleThread executed using Thread");
        thread.start();
        thread.join();
    }
}

class SimpleRunnable implements Runnable {

    private static final Logger log =
            (Logger) LoggerFactory.getLogger(SimpleRunnable.class);

    private String message;

    SimpleRunnable(String message) {
        this.message = message;
    }


    @Override
    public void run() {
        log.info(message);
    }

    @Test
    public void givenRunnable_whenRunIt_thenResult()
            throws Exception {
        Thread thread = new Thread(new SimpleRunnable(
                "SimpleRunnable executed using Thread"));
        thread.start();
        thread.join();
    }

}


