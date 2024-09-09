package org.dsapractice.searching;

public class PeakInMountainArray {

    public static void main(String[] args) {

        int[] nums = {3, 5, 3, 2, 1};
        System.out.println(peakIndexInMountainArray(nums));
    }

    public static int peakIndexInMountainArray(int[] nums) {
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

    public int findPeakElement(int[] nums) {

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


