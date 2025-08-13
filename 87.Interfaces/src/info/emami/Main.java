package info.emami;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnable flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

/*        flier.takeoff();
        flier.fly();
        tracked.track();
        flier.land();*/

        inFlight(flier);
        inFlight(new Jet());


    }

    private static void inFlight(FlightEnable flier){

        flier.takeoff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
