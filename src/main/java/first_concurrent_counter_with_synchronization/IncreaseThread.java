package first_concurrent_counter_with_synchronization;

public class IncreaseThread extends Thread {

    private final Counter counter;
    private final int increaseNumber;

    public IncreaseThread(Counter counter, int increaseNumber) {
        this.counter = counter;
        this.increaseNumber = increaseNumber;
    }


    @Override
    public void run() {
        for (int i = 0; i < increaseNumber; i++) {
            counter.increase();
        }
    }
}
