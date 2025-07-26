package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {


    public static int[] sortIntegers(int[] array){

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;

        while(flag){
            flag = false;
            for(int i = 0 ; i < sortedArray.length -1 ; i++){

                if(sortedArray[i] < sortedArray[i+1]){
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }

            }

        }
        return sortedArray;
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " Contents " + arr[i]);
        }
    }

    public static int[] getIntegers(int len){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[len];
        for ( int i= 0 ; i < len ; i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}
