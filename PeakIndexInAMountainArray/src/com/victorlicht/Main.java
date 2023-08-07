package com.victorlicht;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,20,55,26,17,8,5,4,2,0};
        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(peakIndex2ndSolution(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int[]sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
        int target = sortedArray[sortedArray.length - 1];
        return linearSearch(arr, target);
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length -1 ; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    //Using Binary Search
    public static int peakIndex2ndSolution(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                    return mid;
                }else if (arr[mid] < arr[mid+1]) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }

        return -1;
    }
}

