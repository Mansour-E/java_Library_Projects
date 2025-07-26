package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(10);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

        int[] sortedArray2 = sortIntegers(new int[]{7, 30, 35});
        System.out.println(Arrays.toString(sortedArray2));

        /*Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        for(int i = 0; i < firstArray.length/2 ; i++){
            int temp = firstArray[i];
            firstArray[i] = firstArray[firstArray.length - i - 1 ];
            firstArray[firstArray.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(firstArray));*/
    }

    public static int[] getRandomArray(int len){

        Random random = new Random();
        int[] firstArray = new int[len];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(100);
        }

        return firstArray;

    }

    public static int[] sortIntegers(int[] array){

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true ;


        while(flag){
            flag = false;
            for( int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i+1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }


}
