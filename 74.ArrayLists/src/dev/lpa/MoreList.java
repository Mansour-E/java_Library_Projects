package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class MoreList {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas" , "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        System.out.println(list.getClass().getName());
        //list.add("yogurt");

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}
