package com.victorlicht;

public class Solution{
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1};
    }
}
