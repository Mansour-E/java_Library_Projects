package info.emami;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Collection<String> list = new HashSet<>();

        String[] names = {"Ana", "Bob", "Carol" , "David", "Edna"};

        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Frank");
        list.addAll(Arrays.asList("George", "Helen", "Gray"));
        System.out.println(list);
        System.out.println("Gray is in the list? " + list.contains("Gray"));

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("gray is in the list?" + list.contains("Gray"));
        

    }
}
