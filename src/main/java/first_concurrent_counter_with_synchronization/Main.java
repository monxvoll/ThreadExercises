package first_concurrent_counter_with_synchronization;
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int increaseNum = 123;

        IncreaseThread threadOne = new IncreaseThread(counter,increaseNum);
        IncreaseThread threadTwo = new IncreaseThread(counter,increaseNum);
        IncreaseThread threadThree = new IncreaseThread(counter,increaseNum);

        threadOne.start();
        threadTwo.start();
        threadThree.start();

        try {
            threadOne.join();
            threadTwo.join();
            threadThree.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final value of the count : "+counter.getCount());
    }
}