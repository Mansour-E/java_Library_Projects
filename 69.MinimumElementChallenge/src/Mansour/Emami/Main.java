package Mansour.Emami;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int[] myFirstArray =  readIntegers();
       System.out.println(Arrays.toString(myFirstArray));
       findMin(myFirstArray);
       System.out.println(findMin(myFirstArray));
    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of Integer Numbers , separated by commas: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        System.out.println(Arrays.toString(splits));

        int[] numbers = new int[splits.length];
        for(int i = 0; i < splits.length; i++){
            numbers[i] = Integer.parseInt(splits[i].trim());

        }

        return numbers;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            System.out.println(i);
            if(i < min){
                System.out.println(i + " is the minimum now let check ...");
                min = i ;
            }else{
                System.out.println(i + " was not minimum now let check ...");
            }
        }
        System.out.println("We just found " + min + " as minimum");

        return min;
    }
}
