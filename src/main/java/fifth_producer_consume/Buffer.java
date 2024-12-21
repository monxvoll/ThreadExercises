package fifth_producer_consume;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private Queue<Integer> queue;
    private int capacity;

    public Buffer(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void add(int element) throws InterruptedException {
        while (queue.size() == capacity) {
            System.out.println("Buffer full. Producer waiting...");
            wait();
        }
        queue.add(element);
        System.out.println("Producer added: " + element);
        notify();
    }

    public synchronized int retirar() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Buffer empty. Consumer waiting...");
            wait();
        }
        int element = queue.remove();
        System.out.println("Consumer removed: " + element);
        notify();
        return element;
    }
}