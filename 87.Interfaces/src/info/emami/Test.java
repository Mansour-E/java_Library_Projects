package info.emami;

public class Test {

    public static void main(String[] args) {

        inFlight(new info.emami.Jet());

//        OrbitEarth.log("Testing " + new Satellite());

        orbit(new info.emami.Satellite());
    }

    private static void inFlight(info.emami.FlightEnabled flier) {

        flier.takeOff();
        flier.transition(info.emami.FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof info.emami.Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void orbit(info.emami.OrbitEarth flier) {

        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
