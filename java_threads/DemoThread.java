package java_threads;

class Sum implements Runnable{
    private final int[] arr;
    private final int start, end;
    private int partialSum = 0;

    Sum(int[] arr, int start, int  end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run() {
        for(int i = start; i <= end; i++) {
            partialSum += arr[i];
        }
    }

    int getPartialSum() {
        return partialSum;
    }
}

public class DemoThread {
    static void main() {
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80};
        int mid = nums.length / 2;

        Sum task1 = new Sum(nums, 0, mid);

        Thread t1 = new Thread(task1);
//        Thread t2 = new Thread(task2);

        t1.start(); // Begins concurrent execution of Thread 1
//        t2.start(); // Begins concurrent execution of Thread 2

        try {
            t1.join();  // Blocks main thread until Thread 1 finishes
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        t2.join();  // Blocks main thread until Thread 2 finishes

        int totalSum = task1.getPartialSum();
//        int totalSum = task1.getPartialSum() + task2.getPartialSum();
        System.out.println("Total: " + totalSum); // Outputs 360
    }
}
