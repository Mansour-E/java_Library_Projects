package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList<String> places = new LinkedList<>();
        menu();
        String inputt = scan.nextLine().toUpperCase();
        char input = inputt.charAt(0);
        switch (input){
            case "F" ->;
            case "B" ->;
            case "L" ->;
            case "M" ->;
            default ->;
        }

    }

    public static void menu(){
        System.out.println("""
                
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

    public String


}
