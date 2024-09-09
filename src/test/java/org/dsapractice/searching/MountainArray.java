package org.dsapractice.searching;

public class MountainArray {

    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 2, 1};

        System.out.println(findInMountainArray(2, nums));
    }


    public static int findInMountainArray(int target, int[] nums) {

        int index = orderAgnosticBinarySearch(nums, target, 0, findPeakElement(nums));

        if (index == -1) {
            index = orderAgnosticBinarySearch(nums, target, findPeakElement(nums) + 1, nums.length - 1);
        }
        return index;

    }

    static int orderAgnosticBinarySearch(int[] nums, int target, int start, int end) {

        boolean isAsc = nums[start] < nums[end];
        while (start <= end) {

            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (nums[mid] < target) {
                    start = mid + 1;

                }
                if (nums[mid] > target) {
                    end = mid - 1;
                }
            } else {
                if (target < nums[mid]) {
                    start = mid + 1;

                }
                if (target > nums[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }


    public static int findPeakElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            }
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }
}
