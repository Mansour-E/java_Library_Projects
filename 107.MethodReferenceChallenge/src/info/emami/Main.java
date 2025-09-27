package info.emami;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main{

    private static Random random = new Random();
    private record Person(String first){

        public String last(String s){
            return first + " " + s.substring(0 , s.indexOf(" "));
        }
    }
    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "Cameron", "Donald", "Eva", "Francis"};
        Person tim = new Person("Tim");
        List<UnaryOperator<String>> stringFunctions = new ArrayList<>(List.of(

                String::toUpperCase,
                s -> s += " " + getRandomChar('D', 'M') + ".",
                s -> s += " " + reverse(s , 0 , s.indexOf(" ")),
                Main::reverse,
                String::new,
                s -> new String("Howdi" + s),
                String::valueOf,
                tim::last,
                (new Person("Mary"))::last
        ));
        applyChanges(names, stringFunctions);

    }

    private static void applyChanges(String[] names, List<UnaryOperator<String>> stringfunctions){

        List<String> backedByArray = Arrays.asList(names);
        for (var function : stringfunctions){
            backedByArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    private static char getRandomChar(char start, char end){
        return (char) random.nextInt((int) start, (int) end + 1);
    }

    private static String reverse(String firstName){
        return reverse(firstName, 0 , firstName.length());
    }
    private static String reverse(String firstName, int start , int end){
        return new StringBuilder(firstName.substring(start, end)).reverse().toString();
    }

}
