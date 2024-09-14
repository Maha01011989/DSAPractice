package org.dsapractice.searching;

public class SingleElement {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        System.out.println(binarySearch(nums, 0, nums.length, true));
    }

    static int binarySearch(int[] nums, int start, int end, boolean isFirstHalf) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                return nums[mid];
            } else if (nums[mid] == nums[mid - 1]) {
                end = mid - 2;
            }
        }
        return -1;
    }
}
