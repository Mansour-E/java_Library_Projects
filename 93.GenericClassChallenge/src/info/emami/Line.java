package info.emami;

public abstract class Line implements Mappable{

    protected double[][] locations;

    public Line(double[][] locations) {
        this.locations = new double[locations.length][];
    }

    private String location(){

        return null;
    }

    @Override
    public void render() {

    }
}
