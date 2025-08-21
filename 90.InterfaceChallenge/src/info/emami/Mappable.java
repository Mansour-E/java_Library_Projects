package info.emami;

enum Geometry {LINE, POINT, POLYGON}
enum Color {BLACK, BLUE, GREEN,ORANGE, RED}
enum PointMarkers {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}
enum LineMarkers {DASHED, DOTTED, SOLID}

public interface Mappable {

    String JSON_PROPERTY = """
           "properties": {%s} """;

    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON(){
        return """
                "type": "%s", "label": "%s" ,"marker": "%s """.formatted(getShape(), getLabel() , getMarker());
    }
}
