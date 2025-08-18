package info.emami;

import java.util.Arrays;

public abstract class Line implements Mappable{

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
