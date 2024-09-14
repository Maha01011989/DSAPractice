package org.dsapractice.arrays;

import java.util.Arrays;

public class PLusOne {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (int) (nums[i] * Math.pow(10, nums.length - 1 - i));
        }

        sum += 1;
        System.out.println(sum + " ");
        String s = sum + "";
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
    }
}
