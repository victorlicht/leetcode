package com.victorlicht;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,7,7,7,7,7,7,7,7,7,8,8,8,8,99,99,99};
        System.out.println(Arrays.toString(searchRange(arr, 99)));
    }
    public static int[] searchRange(int[] nums, int target) {
        var start = 0;
        var end = nums.length - 1;
        int[] result = new int[2];
        int mid = 0;
        while (start <= end) {
           mid = (start + end) / 2;
           if (nums[mid] == target && (mid == 0 || nums[mid - 1] < target)) {
               result[0] = mid;
               break;
           }else if (nums[mid] < target) {
               start = mid + 1;
           }else {
               end = mid - 1;
           }
        }
        start = mid;
        end = nums.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] > target)) {
                result[1] = mid;
                return result;
            }else if (nums[mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
            return new int[]{-1, -1};
    }
}
