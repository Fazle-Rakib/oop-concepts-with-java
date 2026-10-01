package java_threads;

// Demonstrates a race condition: three threads share one counter object.
// Each increments it 10000 times. Expected total: 30000. Actual: less, and varies each run.

class DownloadCounter {
    int completedDownloads = 0; // shared mutable state — not thread-safe

    void recordCompletion() {
        completedDownloads++; // read-modify-write: three steps, not atomic
    }
}

class UnsafeWorker implements Runnable {
    private DownloadCounter counter;
    private String          workerName;

    UnsafeWorker(DownloadCounter counter, String workerName) {
        this.counter    = counter;
        this.workerName = workerName;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.recordCompletion(); // multiple threads may interleave here
        }
        System.out.println(workerName + " done.");
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {

        DownloadCounter counter = new DownloadCounter();

        Thread t1 = new Thread(new UnsafeWorker(counter, "Worker-1"));
        Thread t2 = new Thread(new UnsafeWorker(counter, "Worker-2"));
        Thread t3 = new Thread(new UnsafeWorker(counter, "Worker-3"));

        t1.start(); t2.start(); t3.start();
        t1.join();  t2.join();  t3.join();

        System.out.println("Expected: 30000");
        System.out.println("Actual  : " + counter.completedDownloads);
        // The lost updates happen because ++ is not atomic:
        //   Thread A reads 5000 → Thread B reads 5000 → both write 5001 → one increment lost.
    }
}
