package dev.lpa;

public class Main {

    public static void main(String... args) {

        System.out.println("Hello World again");

        String[] splitString = "Hello World again".split(" ");
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello" , "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth" , "fifth"};
        System.out.println(String.join(",", sArray));
        
    }
    public static void printText(String... splitString) {
        for (String s : splitString) {
            System.out.println(s);
        }
    }
}
