package org.dsapractice.arrays;

import java.util.*;

public class AllDuplicates {

    public static void main(String[] args) {
        int[] nums = {1};

        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int expPos = nums[i] - 1;

            if (nums[i] != nums[expPos]) {
                swapArr(nums, i, expPos);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                li.add(nums[j]);
            }
        }
        return li;
    }

    public static void swapArr(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}








