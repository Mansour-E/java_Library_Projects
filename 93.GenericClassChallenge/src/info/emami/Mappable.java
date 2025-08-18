package info.emami;

import java.util.Arrays;

public interface Mappable {

    void render();

    static double[] stringToLatLon(String location){

        var splits = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lng = Double.valueOf(splits[1]);
        return new double[]{lat, lng};
    }
}

abstract class Point implements Mappable{

    protected double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    private String location(){

        return Arrays.toString(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + location() + ")");
    }



}

abstract class Line implements Mappable{

    protected double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int i = 0;
        for(var l : locations){
            this.locations[i++] = Mappable.stringToLatLon(l); // i love that . this method will take them as String then put them in that Array
        }
    }

    private String locations(){

        return Arrays.deepToString(locations);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as LINE (" + locations() + ")");
    }
}
