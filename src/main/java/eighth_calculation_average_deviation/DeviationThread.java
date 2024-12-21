package eighth_calculation_average_deviation;


public class DeviationThread extends Thread {
    private final MathOperation mathOperation;
    private final double average;
    private double standardDeviation;

    public DeviationThread(MathOperation mathOperation, double average) {
        this.mathOperation = mathOperation;
        this.average = average;
    }

    @Override
    public void run() {
        standardDeviation = mathOperation.calculateStandardDeviation(average);
    }

    public double getStandardDeviation() {
        return standardDeviation;
    }
}

