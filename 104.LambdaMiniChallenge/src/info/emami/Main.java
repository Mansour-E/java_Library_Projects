package info.emami;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (String part: parts){
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printwordsLamda = s -> {
            String[] parts = s.split(" ");
            for (String part: parts){
                System.out.println(part);
            }
        };

        printTheParts.accept("Let's split this up into an array");
        printwordsLamda.accept("Let's split this up into an array");

        Consumer<String> printWordforEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };
        printWordforEach.accept("Let's split this up into an array");

        Consumer<String> printwordoneline = sentence -> Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        printwordoneline.accept("Let's split this up into an array");

        Function<String, String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };

        UnaryOperator<String> every = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };

        System.out.println(everySecondChar.apply("123456890"));

        System.out.println(everySecondCharacter( source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        } , "123456890"));

        //supply lambda
        Supplier<String> iLoveJava = () -> " I love Java!";
        Supplier<String> i_LoveJava = () -> {return "I Love Java!";};

        System.out.println(iLoveJava.get());
        System.out.println(i_LoveJava.get());

    }

    public static String everySecondChar(String source){

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }

        return returnVal.toString();
    }

    public static String everySecondCharacter(Function<String, String> func , String source){

        return func.apply(source);
    }

}
