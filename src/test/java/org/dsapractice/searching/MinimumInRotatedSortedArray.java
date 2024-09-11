package org.dsapractice.searching;

public class MinimumInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(findMin(nums));
    }


    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums[start] < nums[end]) {
            return nums[start];
        } else {
            while (start < end) {
                int mid = (start + end) / 2;

                if (mid < end && nums[mid] > nums[mid + 1]) {
                    return nums[mid + 1];
                }
                if (mid > start && nums[mid] < nums[mid - 1]) {
                    return nums[mid];
                } else if (nums[start] >= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    }

}
