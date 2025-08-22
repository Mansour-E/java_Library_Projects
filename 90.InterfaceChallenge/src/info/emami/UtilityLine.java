package info.emami;

enum UtilityType {ELECTRICAL, FIBER_OPTIC}

public class UtilityLine implements Mappable{

    private String name;
    private UtilityType type;


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
