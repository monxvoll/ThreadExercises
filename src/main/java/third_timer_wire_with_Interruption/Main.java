package third_timer_wire_with_Interruption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TimerThread temporizador = new TimerThread();
        temporizador.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to interrupt de timer...");
        scanner.nextLine();
        temporizador.interrupt();
    }
}
