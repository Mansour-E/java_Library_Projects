package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(10);
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static int[] getRandomArray(int len){

        Random random = new Random();
        int[] firstArray = new int[len];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(100);
        }

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        for(int i = 0; i < firstArray.length/2 ; i++){
            int temp = firstArray[i];
            firstArray[i] = firstArray[firstArray.length - i - 1 ];
            firstArray[firstArray.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(firstArray));

        return firstArray;

    }
}
