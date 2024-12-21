package seventh_cyclic_barrier;

import java.util.Random;

public class Task {
    Random random = new Random();

    public void sum(int limit) {
        int value = random.nextInt(5) + 1;
        for (int i = 0; i <= limit; i++) {
            value += value;
        }
        System.out.println(Thread.currentThread().getName() + " computed value : " + value);
    }
}
