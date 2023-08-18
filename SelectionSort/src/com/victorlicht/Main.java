package com.victorlicht;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {4,5,1,2,3};
        System.out.println(Arrays.toString(unsortedArray));
        selectionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static void selectionSort(int[] unsortedArray) {
        int lastIndex = unsortedArray.length - 1;
        while (lastIndex >= 1) {
            int maxIndex = 0;
            for (int i = 0; i < lastIndex; i ++) {
                if (unsortedArray[maxIndex] < unsortedArray[i + 1])
                    maxIndex = i + 1;
            }
            int temp = unsortedArray[lastIndex];
            unsortedArray[lastIndex] = unsortedArray[maxIndex];
            unsortedArray[maxIndex] = temp;
            lastIndex --;
        }
    }
}
