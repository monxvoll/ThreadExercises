package sixty_race_simulation;

public class RacerThread extends Thread {

    private RaceSimulator raceSimulator;
    private int runnerID;
    private int distance;

    public RacerThread(RaceSimulator raceSimulator,int runnerID, int distance) {
        this.raceSimulator = raceSimulator;
        this.runnerID = runnerID;
        this.distance = distance;
    }

    @Override
    public void run() {
        raceSimulator.runRace(runnerID,distance);
    }
}
