package info.emami;

import java.util.Arrays;

public abstract class Point implements Mappable{

    protected double[] location = new double[2];

    private String location(){

        return Arrays.toString(location);
    }

    @Override
    public void render() {

    }



}
