package second_calculation_of_factorials_with_nested_threads;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();
        int factorialToCalculate = 15;
        CalculatorThread threadOne = new CalculatorThread(operation,factorialToCalculate,1);
        CalculatorThread threadTwo = new CalculatorThread(operation,factorialToCalculate,2);
        CalculatorThread threadThree= new CalculatorThread(operation,factorialToCalculate,3);

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

       long factorial = threadOne.getPartialResult() * threadTwo.getPartialResult() * threadThree.getPartialResult();

        System.out.println("The factorial of " + factorialToCalculate + " is: " + factorial);
    }
}
