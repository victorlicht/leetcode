package com.victorlicht;

public class Main {
    public static void main(String[] args) {
        int[] array = {3,3,3,3,3,3,3,3,1};
        System.out.println(findMin(array));

    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(end == start)
                return nums[end];
            if (nums[mid] > nums[end]){
                start= mid +1;
            }else {
                if (nums[mid] < nums[end]){
                    end = mid;
                }else {
                    end --;
                }
            }
        }
        return nums[end];
    }
}
