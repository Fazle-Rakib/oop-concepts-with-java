package java_threads;

// Compares the two ways to create a thread: extending Thread vs implementing Runnable.
// Runnable is preferred because Java allows only single inheritance.

// Approach 1: extend Thread — the class IS a thread (tight coupling)
class VideoDownloader extends Thread {
    private String url;

    VideoDownloader(String url) {
        this.url = url;
    }

    public void run() {
        System.out.println("[Thread]   Downloading: " + url);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("[Thread]   Done: " + url);
    }
}

// Approach 2: implement Runnable — the class DESCRIBES a task (loose coupling)
class ImageDownloader implements Runnable {
    private String url;

    ImageDownloader(String url) {
        this.url = url;
    }

    public void run() {
        System.out.println("[Runnable] Downloading: " + url);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("[Runnable] Done: " + url);
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) throws InterruptedException {

        // Approach 1: VideoDownloader is a Thread — start it directly
        VideoDownloader t1 = new VideoDownloader("video.mp4");
        t1.start();

        // Approach 2: ImageDownloader is a Runnable — wrap it in a Thread object
        Thread t2 = new Thread(new ImageDownloader("cover.jpg"));
        t2.start();

        // Approach 2 (shorthand): anonymous class avoids a named Runnable subclass
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                System.out.println("[Anon]     Downloading: thumbnail.png");
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                System.out.println("[Anon]     Done: thumbnail.png");
            }
        });
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete.");
        // Runnable is preferred: ImageDownloader can still extend another class if needed.
    }
}
