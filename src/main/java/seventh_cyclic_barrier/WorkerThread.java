package seventh_cyclic_barrier;

public class WorkerThread extends Thread {
    private final Task task;
    private final int limit;
    private final CyclicBarrier barrier;

    public WorkerThread(Task task, int limit, CyclicBarrier barrier) {
        this.task = task;
        this.limit = limit;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " starts phase : " + (i));
                task.sum(limit);

                System.out.println(Thread.currentThread().getName() + " reached barrier in phase : " + (i));
                barrier.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}