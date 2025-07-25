package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int[] firstArray = new int[10];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        for(int i = 0; i < firstArray.length/2 ; i++){
            int temp = firstArray[i];
            firstArray[i] = firstArray[firstArray.length - i - 1 ];
            firstArray[firstArray.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(firstArray));
    }

    public static int[] getRandomArray(int length){}
}
