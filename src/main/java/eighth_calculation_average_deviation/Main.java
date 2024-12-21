package eighth_calculation_average_deviation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        MathOperation mathOperation = new MathOperation(list);
        AverageThread averageThread = new AverageThread(mathOperation);

        averageThread.start();

        try {

            averageThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double average = averageThread.getAverage();
        System.out.println("Average: " + average);


        DeviationThread deviationThread = new DeviationThread(mathOperation, average);
        deviationThread.start();

        try {
            deviationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Numbers List: " + list);
        System.out.println("Standard Deviation: " + deviationThread.getStandardDeviation());
    }
}
