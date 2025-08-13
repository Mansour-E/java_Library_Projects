package info.emami;

enum FlightStages implements Trackable{GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;


    @Override
    public void track() {

        if (this != GROUNDED) {

            System.out.println("Monitoring " + this);
        }
    }
}

record DragonFly(String name , String type) implements FlightEnabled{


    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth{


    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled{

    void achieveOrbit();
}

interface FlightEnabled {

    public static final double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    public abstract void takeoff(); // redundant because interface is public and abstract and just condrit method can be private
    abstract void land(); // redundant the reason is oben
    void fly();

}

interface Trackable{

    void track();

}

public abstract class Animal {

    public abstract void move();

}
