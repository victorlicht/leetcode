package com.victorlicht;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(unsortedArray));
        InsertionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
    public static void InsertionSort(int[] unsortedArray) {
        int lastIndex = unsortedArray.length - 1;
        for (int i = 1; i <= lastIndex; i++) {
            for (int j = i; j > 0; j--) {
                if (unsortedArray[j] < unsortedArray[j - 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j - 1];
                    unsortedArray[j - 1] = temp;
                }else {
                    break;
                }
            }
        }
    }
}
