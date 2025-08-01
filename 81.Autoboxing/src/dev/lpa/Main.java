package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15);         //preferred but unnecessary
        Integer depricatedBoxing = new Integer(15);  //deprecated since JDK 9
        int unboxingInt = boxedInt.intValue();            //unnecessary

        //Autoboxing
        Integer autoBoxing = 15;
        int autounboxing = autoBoxing;

        System.out.println(autoBoxing.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characteerArray = {'a', 'b', 'c','d'};
        System.out.println(Arrays.toString(characteerArray));

        var ourList = List.of(1, 2, 3, 4, 5);
        System.out.println(ourList);

    }
    private static ArrayList<Integer> getList(int... varargs){//oder Integer auch geht wegen auto inboxing

        ArrayList<Integer> aList = new ArrayList<>();

        for(int i: varargs){
            aList.add(i);
        }

        return aList;

    }

    private static int returnAnInt(Integer i){

        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }
    public static Double getDoubleObject(){

        return Double.valueOf(100.00);
    }

    public static double getLiteralDoublePrimitive(){

        return 100.0;
    }
}
