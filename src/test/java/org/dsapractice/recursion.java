package org.dsapractice;

public class recursion {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 3;
        System.out.println(binarySearch(0, nums.length - 1, target, nums));

    }

    static int binarySearch(int start, int end, int target, int[] nums) {
        int mid = (start + end) / 2;

        if (start > end) {
            return -1;
        }
        if (nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            return binarySearch(start, mid - 1, target, nums);
        }
        return binarySearch(mid + 1, end, target, nums);
    }
}
