package first_concurrent_counter_with_synchronization;
public class Counter {

    private int count = 0;

    public synchronized void increase(){
        count ++;
    }

    public int getCount() {
        return count;
    }
}
