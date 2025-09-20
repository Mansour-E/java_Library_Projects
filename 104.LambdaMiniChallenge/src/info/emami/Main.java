package info.emami;

import java.util.Arrays;
import java.util.function.Consumer;

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
    }
}
