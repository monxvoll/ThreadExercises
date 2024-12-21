package sixty_race_simulation;

public class Main {
    public static void main(String[] args) {
        RaceSimulator raceSimulator = new RaceSimulator();
        int distance = 100;

        RacerThread racerA =  new RacerThread(raceSimulator,1,distance);
        RacerThread racerB =  new RacerThread(raceSimulator,2,distance);
        RacerThread racerC =  new RacerThread(raceSimulator,3,distance);
        RacerThread racerD =  new RacerThread(raceSimulator,4,distance);
        RacerThread racerE =  new RacerThread(raceSimulator,5,distance);

         racerA.start();
         racerB.start();
         racerC.start();
         racerD.start();
         racerE.start();

        try {
            racerA.join();
            racerB.join();
            racerC.join();
            racerD.join();
            racerE.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
