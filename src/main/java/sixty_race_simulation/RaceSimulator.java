package sixty_race_simulation;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class RaceSimulator {
    private final Random random = new Random();
    private final AtomicBoolean raceFinished = new AtomicBoolean(false);

    public void runRace(int runnerID, int distance) {
        int progress = 0;

        while (progress < distance) {
            if (raceFinished.get()) {
                return;
            }
            progress += random.nextInt(10);
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (raceFinished.compareAndSet(false, true)) {
            System.out.println("¡Runner " + runnerID + " won the race!");
        }
    }
}