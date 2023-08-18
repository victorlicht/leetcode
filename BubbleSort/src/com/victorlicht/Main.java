package com.victorlicht;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {15, 88, 120451, -45, 5, -5, 18};
        bubbleSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
    public static void bubbleSort(int[] unsortedArray) {
        int length = unsortedArray.length - 1;
        boolean unsorted = true;
        while (unsorted) {
            for (int i = 0; i < length; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    swap(unsortedArray, i);
                }
                if (length == 1) unsorted = false;
            }
            length --;
        }
    }
    public static void swap(int[] unsortedArray, int i) {
        int temp = unsortedArray[i];
        unsortedArray[i] = unsortedArray[i + 1];
        unsortedArray[i + 1] = temp;
    }
}
