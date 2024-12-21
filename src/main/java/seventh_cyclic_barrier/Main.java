package seventh_cyclic_barrier;

public class Main {
    public static void main(String[] args) {
        int numThreads = 4;
        CyclicBarrier barrier = new CyclicBarrier(numThreads);
        Task task = new Task();

        for (int i = 0; i < numThreads; i++) {
            new WorkerThread(task, 10, barrier).start();
        }
    }
}