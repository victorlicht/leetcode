package com.victorlicht;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int [] arr = {1, 2, 3, 1};
        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(sol.containsDuplicated(arr));
        System.out.println(sol.containsDuplicated(arr1));
        System.out.println(sol.containsDuplicated(arr2));
    }
}

