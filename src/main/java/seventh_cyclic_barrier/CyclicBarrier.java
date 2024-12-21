package seventh_cyclic_barrier;

public class CyclicBarrier {

    private final int totalThreads;
    private int waitingThreads = 0;

    public CyclicBarrier(int totalThreads) {
        this.totalThreads = totalThreads;
    }

    public synchronized void await() throws InterruptedException {
        waitingThreads++;

        if (waitingThreads == totalThreads) {
            waitingThreads = 0;
            notifyAll();
        } else {
            wait();
        }
    }
}