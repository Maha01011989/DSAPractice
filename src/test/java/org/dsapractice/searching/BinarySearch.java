package org.dsapractice.searching;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {-20, -15, -1, 0, 1, 2, 3, 4, 5, 6, 8, 10, 12, 33};
        int target = -20;

        System.out.println(binarySearch(nums, target));


    }


    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;


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

}
