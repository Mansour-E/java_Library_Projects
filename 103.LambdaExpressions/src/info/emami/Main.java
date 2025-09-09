package info.emami;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta"));

        for(String s : list){
            System.out.println(s);
        }

        System.out.println("--------");
        list.forEach((var s) -> System.out.println(s));
        list.forEach((var s) -> {
            System.out.println("Hello");
            System.out.println(s);

            System.out.println("--------");
            String prefix = "nato";
            list.forEach((var myString) -> {
                char first = myString.charAt(0);
                System.out.println(prefix + " " +myString + " means " + first);
            });

        });

        int result = calculator((var a, var b) -> a + b, 5,2);
        var result2 = calculator((var a , var b) -> a/b, 10.0, 2.5);
        var result3 = calculator(
                (a, b) -> a.toUpperCase() + " " + b.toUpperCase(),
                "Ralph", "Kramden"
        );

        var result4 = calculator2((var a , var b) -> a + b , 5,3);

        var coords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659}
        );
        coords.forEach(s -> System.out.println(Arrays.toString(s)));

    }

    public static <T> T calculator(Operation<T> function, T value1, T value2){

        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;

    }

    public static <T> T calculator2(BinaryOperator<T> function, T value1, T value2){

        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }




}

