package info.emami;

import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable>{

    private List<T> layerElements;

    public Layer(T[] layerElement) {
        this.layerElements = new ArrayList<T>(List.of(layerElement));
    }

    public void addElement(T... elemenst){

        layerElements.addAll(List.of(elemenst));
    }

    public void renderLayer(){

        for ( T element : layerElements){
            element.render();
        }
    }

}
