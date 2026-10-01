package java_threads;

// Introduces threads by showing the problem they solve:
// two tasks run sequentially (~4s) then concurrently (~2s).

class DownloadTask implements Runnable {
    private String fileName;
    private int    durationMs; // simulated download time

    DownloadTask(String fileName, int durationMs) {
        this.fileName   = fileName;
        this.durationMs = durationMs;
    }

    public void run() {
        System.out.println("Starting : " + fileName);
        try {
            Thread.sleep(durationMs); // simulate network download
        } catch (InterruptedException e) {
            System.out.println(fileName + " was interrupted.");
        }
        System.out.println("Finished : " + fileName);
    }
}

public class ThreadIntro {
    public static void main(String[] args) throws InterruptedException {

        // --- Sequential: tasks run one after another ---
        System.out.println("=== Sequential ===");
        long start = System.currentTimeMillis();

        new DownloadTask("report.pdf",  2000).run(); // runs on the main thread
        new DownloadTask("dataset.csv", 2000).run();

        System.out.println("Time: " + (System.currentTimeMillis() - start) + "ms\n");

        // --- Concurrent: each task runs in its own thread ---
        System.out.println("=== Concurrent ===");
        start = System.currentTimeMillis();

        Thread t1 = new Thread(new DownloadTask("report.pdf",  2000));
        Thread t2 = new Thread(new DownloadTask("dataset.csv", 2000));
        t1.start(); // begins a new independent execution path
        t2.start();
        t1.join();  // main thread waits until t1 finishes
        t2.join();

        System.out.println("Time: " + (System.currentTimeMillis() - start) + "ms");
        // Both downloads complete in ~2s instead of ~4s.
    }
}
