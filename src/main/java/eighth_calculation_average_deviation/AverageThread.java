package eighth_calculation_average_deviation;

public class AverageThread extends Thread {

    private final MathOperation mathOperation;
    private double average;

    public AverageThread(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }


    @Override
    public void run() {
       average = mathOperation.fillList();
    }

    public double getAverage() {
        return average;
    }
}
