package dev.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceries = new ArrayList<>();

        System.out.println("Available actions: \n" +
                           "0 - to shutdown\n" +
                           "1 - to add item(s) to list (comma delimited list)" + "\n" +
                           "2 - to remove any items (comma delimited list)\n" +
                           "Enter a number for which action you want to do: ");
        int action = scanner.nextInt();
        while(action != 0){
            if(action == 1){
                String input = scanner.nextLine();
                String [] items = input.split(",");
                groceries.addAll(List.of(items));

            }
            if(action == 2){

            }

        }




    }
}
