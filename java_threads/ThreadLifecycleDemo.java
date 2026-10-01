package java_threads;

// Demonstrates the Thread lifecycle: NEW → RUNNABLE → (TIMED_WAITING via sleep) → TERMINATED.
// Also shows thread naming and join() — main thread blocks until a download thread finishes.

class FileDownloader implements Runnable {
    private String fileName;
    private int    chunks; // number of 500ms download chunks

    FileDownloader(String fileName, int chunks) {
        this.fileName = fileName;
        this.chunks   = chunks;
    }

    public void run() {
        String name = Thread.currentThread().getName(); // each thread has its own name
        System.out.println("[" + name + "] Starting " + fileName);

        for (int i = 1; i <= chunks; i++) {
            System.out.println("[" + name + "] " + fileName + " — chunk " + i + "/" + chunks);
            try {
                Thread.sleep(500); // thread enters TIMED_WAITING during the pause
            } catch (InterruptedException e) {
                System.out.println("[" + name + "] Interrupted while downloading.");
                return;
            }
        }

        System.out.println("[" + name + "] Finished " + fileName);
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new FileDownloader("lecture.mp4", 3), "Downloader-1");
        Thread t2 = new Thread(new FileDownloader("slides.pdf",  2), "Downloader-2");

        System.out.println("t1 state before start: " + t1.getState()); // NEW

        t1.start();
        t2.start();

        System.out.println("t1 state after start:  " + t1.getState()); // RUNNABLE or TIMED_WAITING

        t1.join(); // main thread pauses here until t1 reaches TERMINATED
        t2.join();

        System.out.println("t1 state after join:   " + t1.getState()); // TERMINATED
        System.out.println("All files downloaded.");
    }
}
