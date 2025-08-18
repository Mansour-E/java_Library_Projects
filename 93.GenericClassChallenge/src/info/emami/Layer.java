package info.emami;

import java.util.List;

public class Layer <T extends Mappable>{

    private List<T> layerElement;

    public Layer(List<T> layerElement) {
        this.layerElement = layerElement;
    }

    public void renderLayer(List<T> mapped){

    }

    public void addElement()
}
