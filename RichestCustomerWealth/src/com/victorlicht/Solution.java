package com.victorlicht;

public class Solution {

    public int maximumWealth(int[][] accounts) {
        int wealthyCustomer = 0;
        for (int[] customer : accounts) {
            int testingCustomer = 0;
            for (int moneyInBank : customer) {
                testingCustomer += moneyInBank;
            }
            if (testingCustomer > wealthyCustomer) wealthyCustomer = testingCustomer;
        }
        return wealthyCustomer;
    }
}
