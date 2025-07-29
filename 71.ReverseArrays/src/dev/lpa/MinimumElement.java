package dev.lpa;

import java.util.Arrays;
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

    private static int[] reverseArray(int[] array){

        int maxIndex = array.length - 1;
        int halfLength = array.length/ 2 ;

        int[] reversedArray = Arrays.copyOf(array, array.length);
        for(int i = 0; i < halfLength ; i++){
            int temp = reversedArray[i];
            reversedArray[i] = reversedArray[maxIndex - i];
            reversedArray[maxIndex - i] = temp;
        }
        return reversedArray;
    }

    private static int[] reverseCopy(int[] array){

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for(int el : array){
            reversedArray[maxIndex--] = el;

        }
        return reversedArray;
    }
}
