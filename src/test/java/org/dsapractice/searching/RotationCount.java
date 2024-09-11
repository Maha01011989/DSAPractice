package org.dsapractice.searching;

public class RotationCount {

    public static void main(String[] args) {
        int[] nums = {15, 18, 2, 3, 6, 12};
        System.out.println(rotationCount(nums));
    }

    static int rotationCount(int[] arr) {
        return getPivot(arr) + 1;
    }

    static int getPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
