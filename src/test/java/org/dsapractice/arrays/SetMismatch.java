package org.dsapractice.arrays;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] nums = {3,2,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int expPos = nums[i] - 1;

            if (nums[i] != nums[expPos]) {
                swapArr(nums, i, expPos);
            } else {
                i++;
            }
        }
        int[] arr = new int[2];
        int j = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                arr[j] = nums[index];
                arr[j + 1] = index + 1;
                j++;
            }
        }
        return arr;

    }

    public static void swapArr(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
