package second_calculation_of_factorials_with_nested_threads;


public class Operation {
    public  long calculateFactorial(int thirdPart, int part){
        long factorial = 1;
        int iterator = 0;
        switch (part) {
            case 1:
                iterator = 1;
                break;
            case 2:
                iterator = thirdPart+1;
                thirdPart= thirdPart*2;
                break;
            case 3:
                iterator=(thirdPart*2)+1;
                thirdPart=thirdPart*3;
                break;
        }
        for (int i = iterator; i <= thirdPart; i++) {
            factorial *= i;
        }
       return factorial;
    }
}
