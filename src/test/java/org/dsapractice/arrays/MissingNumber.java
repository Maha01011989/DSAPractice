package org.dsapractice.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {4,3,2,0};

        System.out.println(missingNumber(nums));

    }

    static int missingNumber(int[] nums) {

        {

            int i = 0;
            while (i < nums.length) {
                if (nums[i]<nums.length && nums[i] != i) {
                    int temp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = temp;
                } else {
                    i++;
                }
            }
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != j) {
                    return j;
                }
            }
            return nums.length;
        }
    }
}




