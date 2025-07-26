package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] arr = SortedArray.getIntegers(5);
        System.out.println(Arrays.toString(arr));

        int[] sortedArray;
        sortedArray = SortedArray.sortIntegers(arr);
        System.out.println(Arrays.toString(sortedArray));

        SortedArray.printArray(sortedArray);
    }


}
