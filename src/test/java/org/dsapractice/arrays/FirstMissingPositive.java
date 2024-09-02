package org.dsapractice.arrays;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] nums = {9,1,10};
        System.out.println(firstMissingPOsitive(nums));
    }

    public static int firstMissingPOsitive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int expPos = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length) {
                if (nums[i] != nums[expPos]) {
                    swapArr(nums, i, expPos);
                } else {
                    i++;
                }

            } else {
                i++;
            }
        }
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
            j++;
        }
        return j + 1;
    }

    public static void swapArr(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}

