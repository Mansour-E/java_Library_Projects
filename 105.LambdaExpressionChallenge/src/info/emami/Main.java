package info.emami;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {

        String[] names = new String[]{"Anna", "Bob", "Carol", "David" , "Ed", "Fred", "Gary"};
        ArrayList<String> namess = new ArrayList<>(List.of("Anna", "Bob", "Carol", "David" , "Ed", "Fred", "Gary"));

        //Array
        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println("--> Transform to Uppercase");
        System.out.println(Arrays.toString(names));

        //rap to List
        List<String> backedByArray = Arrays.asList(names);


        //List
        namess.replaceAll(s -> s.toUpperCase());
        namess.forEach(s -> System.out.println(s));

        namess.replaceAll(s -> )
    }

    public static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt((int) startChar, (int) endChar+1);
    }

    private static String getReversedName(String firstName){
        return new StringBuilder(firstName).reverse().toString();
    }
}
