package org.dsapractice.searching;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 7));

    }

    public static int search(int[] nums, int target) {

        if (getPivot(nums) == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[getPivot(nums)] == target) {
            return getPivot(nums);
        } else if (target >= nums[0]) {
            return binarySearch(nums, target, 0, getPivot(nums) - 1);
        } else {
            return binarySearch(nums, target, getPivot(nums) + 1, nums.length - 1);
        }

    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {

            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;

            }
            if (nums[mid] > target) {
                end = mid - 1;
            }

        }
        return -1;
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
