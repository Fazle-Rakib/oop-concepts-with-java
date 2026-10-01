package java_threads;

// Fixes the race condition from RaceConditionDemo using the synchronized keyword.
// Only one thread can execute a synchronized method on the same object at a time.

class SafeDownloadCounter {
    private int completedDownloads = 0;

    // synchronized: the JVM holds a lock on this object for the duration of the call
    synchronized void recordCompletion() {
        completedDownloads++; // now the read-modify-write is atomic per thread
    }

    int getCount() {
        return completedDownloads;
    }
}

class SafeWorker implements Runnable {
    private SafeDownloadCounter counter;
    private String              workerName;

    SafeWorker(SafeDownloadCounter counter, String workerName) {
        this.counter    = counter;
        this.workerName = workerName;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.recordCompletion();
        }
        System.out.println(workerName + " done.");
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {

        SafeDownloadCounter counter = new SafeDownloadCounter();

        Thread t1 = new Thread(new SafeWorker(counter, "Worker-1"));
        Thread t2 = new Thread(new SafeWorker(counter, "Worker-2"));
        Thread t3 = new Thread(new SafeWorker(counter, "Worker-3"));

        t1.start(); t2.start(); t3.start();
        t1.join();  t2.join();  t3.join();

        System.out.println("Expected: 30000");
        System.out.println("Actual  : " + counter.getCount()); // always 30000
        // Trade-off: synchronized prevents corruption but adds a small performance cost
        // because threads must queue instead of running freely.
    }
}
