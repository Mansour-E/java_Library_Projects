package info.emami;

public class River extends Line{

    private String name;


    public River(String name, double[][] locations) {
        super(locations);
        this.name = name;
    }
}
