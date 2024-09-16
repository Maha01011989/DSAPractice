package org.dsapractice.arrays;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length-1) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i = i + 2;
        }
        return nums[nums.length - 1];
    }
}
