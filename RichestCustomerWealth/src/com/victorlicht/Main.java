package com.victorlicht;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] testingArray = {
                {1, 2, 3},
                {1, 2, 4},
                {2, 4, 0}
        };

        System.out.println(solution.maximumWealth(testingArray));

    }
}
