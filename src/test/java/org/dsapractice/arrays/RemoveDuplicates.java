package org.dsapractice.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 3, 3, 0};

        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j] = nums[i + 1];
                j++;
            }
        }
        System.out.println(j);
        System.out.println(Arrays.toString(nums));
    }
}

