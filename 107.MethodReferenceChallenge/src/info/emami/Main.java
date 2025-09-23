package info.emami;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {

        String[] names = new String[]{"Anna", "Bob", "Carol", "David" , "Ed", "Fred", "Gary"};

        Arrays.setAll(names, i -> names[i].toUpperCase());

        List<String> list = Arrays.asList(names);
        list.replaceAll(s -> s+= " " + getRandomChar('A','B') + "." + getReversedName(s));
        System.out.println(Arrays.toString(names));





    }

    public static char getRandomChar(char startChar, char endChar){

        return (char) random.nextInt((int) startChar, (int) endChar);
    }

    public static String getReversedName(String firstName){

        return new StringBuilder(firstName).reverse().toString();
    }
}
