package com.victorlicht;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4};
        int minElement = findMin(nums);
        System.out.println("Minimum element: " + minElement);
    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2; // To avoid integer overflow

            if (nums[mid] > nums[end]) {
                // Minimum is in the right half, excluding mid
                start = mid + 1;
            } else if (nums[mid] < nums[end]) {
                // Minimum is in the left half, including mid
                end = mid;
            } else {
                // Handle the case when nums[mid] == nums[end]
                // This means we have duplicate elements, and we can't decide
                // whether to move left or right, so we simply reduce the search range
                end--;
            }
        }

        return nums[start];
    }

}

