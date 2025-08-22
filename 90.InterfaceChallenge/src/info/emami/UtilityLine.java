package info.emami;

enum UtilityType {ELECTRICAL, FIBER_OPTIC, GAS, WATER}

public class UtilityLine implements Mappable{

    private String name;
    private UtilityType type;


    @Override
    public String getLabel() {
        return name + "(" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch(type){
            case ELECTRICAL  -> Color.RED + " " + LineMarkers.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + LineMarkers.DOTTED;
            case GAS         -> Color.ORANGE + " " + LineMarkers.SOLID;
            case WATER       -> Color.BLUE + " " + LineMarkers.SOLID;
            default          ->Color.BLACK + " " + LineMarkers.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name, type);
    }
}
