package com.victorlicht;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {111, 12, 11111, 1254632, 15851686, 21515, 212154, 22, 14452, 2, -12};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int countEven = 0;
        for (int num : nums) {
            if (num < 0) {
                num *= -1;
            }
            if (((int) Math.log10(num) + 1) % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

}
