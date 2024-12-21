package second_calculation_of_factorials_with_nested_threads;

public class CalculatorThread  extends  Thread{
    private final Operation operation;
    private final int number;
    private final int part;
    private long partialResult;
    public CalculatorThread(Operation operation, int number,int part) {
        this.operation = operation;
        this.number = number;
        this.part = part;
    }

    @Override
    public void run() {
        int thirdPart = number/3;
        partialResult = operation.calculateFactorial(thirdPart,part);
    }

    public long getPartialResult() {
        return partialResult;
    }
}
