package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3,4,2,7,6,4};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(reverseArray(arr)));
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
}

