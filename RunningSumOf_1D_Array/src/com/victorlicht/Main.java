package com.victorlicht;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(solution.runningSum(nums)));
    }
}
