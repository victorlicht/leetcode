package com.victorlicht;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 9, 15, 88, 120, 122, 155, 160};
        System.out.println(search(array, 122));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
