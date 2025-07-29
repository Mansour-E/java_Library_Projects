package Mansour.Emami;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);

        int inputSize = scanner.nextInt();

        return inputSize;
    }

    private static int[] readElements(int inputsize){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[inputsize];
        for(int i = 0; i < inputsize; i++){
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();

        }
        return array;
    }

    private static int findMin(int[] array){

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
