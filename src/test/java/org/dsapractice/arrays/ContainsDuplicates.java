package org.dsapractice.arrays;

import java.util.Arrays;

public class ContainsDuplicates {

    public static void main(String[] args) {
            int[] nums = { };

        System.out.println(containsDuplicate(nums));


    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
