package info.emami;

interface FlightEnable{

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
