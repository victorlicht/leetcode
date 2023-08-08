package com.victorlicht;

public class Main {
    public static void main(String[] args) {
        int[][] matrix= {
            {1}
        };
        System.out.println(searchMatrix(matrix, 1));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i <= matrix.length - 1; i++) {
            if (matrix[i][matrix[i].length - 1] >= target) {
                int[] array1D = matrix[i];
                int result = binarySearch(array1D, target);
                if (result != -1)
                    return true;
            }
        }
        return false;
    }

    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == target)
                return mid;
            else if (array[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
