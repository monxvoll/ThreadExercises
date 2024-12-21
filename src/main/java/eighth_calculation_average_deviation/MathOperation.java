package eighth_calculation_average_deviation;

import java.util.List;
import java.util.Random;

public class MathOperation {
    private final Random random;
    private final List<Integer> list;

    public MathOperation(List<Integer> list) {
        this.list = list;
        random = new Random();
    }

    public double fillList() {
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        return (double) list.stream().mapToInt(Integer::intValue).sum() / 10;
    }

    public double calculateStandardDeviation(double average) {
        double sum = 0;
        for (int num : list) {
            sum += Math.pow(num - average, 2);
        }
        return Math.sqrt(sum / list.size());
    }

}
