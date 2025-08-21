package info.emami;

enum UsageType {BUSINES, ENTERTAINMENT}

public class Building implements Mappable{


    @Override
    public String getLabel() {
        return "";
    }

    @Override
    public Geometry getShape() {
        return null;
    }

    @Override
    public String getMarker() {
        return "";
    }
}
