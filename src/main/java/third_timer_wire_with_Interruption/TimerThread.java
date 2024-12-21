package third_timer_wire_with_Interruption;

public class TimerThread extends Thread {
    private boolean interrupted = false;

    public void run() {
        for (int i = 10; i >= 0; i--) {
            if (interrupted) {
                System.out.println("Timer interrupted");
                return;
            }
            try {
                Thread.sleep(1000); // Espera de 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Error");
                return;
            }
        }
        System.out.println("Time Complete");
    }
    public void interrupt (){
        this.interrupted = true;
    }
}
