package org.dsapractice.arrays;

import java.util.Arrays;

public class NumbersSmallerThan {

    public static void main(String[] args) {

        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));

        //System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));


    }


    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j == i)
                    continue;
                if (nums[i] > nums[j])
                    count++;
            }
            arr[i] = count;
        }
        return arr;

    }
}
