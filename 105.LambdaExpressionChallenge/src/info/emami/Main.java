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
        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'D') + ".");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s+= " " + getReversedName(s.split(" ")[0]));
        Arrays.asList(names).forEach(s -> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
        /*newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ")+1)));
       */

        //multi line lamda expression. the easy one
        newList.removeIf(s -> {
            String first = s.substring(0, s.indexOf(" "));
            String last = s.substring(s.indexOf(" "));
            return first.equals(last);
        });
        System.out.println("-->Remove names where first = last");
        newList.forEach(s -> System.out.println(s));


    }

    public static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt((int) startChar, (int) endChar+1);
    }

    private static String getReversedName(String firstName){
        return new StringBuilder(firstName).reverse().toString();
    }
}
