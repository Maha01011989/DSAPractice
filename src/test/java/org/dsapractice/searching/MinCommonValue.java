package org.dsapractice.searching;

public class MinCommonValue {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,6};
        int[] nums2 = {2,3,4,5};

        System.out.println(getCommon(nums1, nums2));

    }

    public static int getCommon(int[] nums1, int[] nums2) {

        if (nums1.length < nums2.length) {
            for (int target : nums1) {
                if (binarySearch(nums2, target, 0, nums2.length) != -1) {
                    return binarySearch(nums2, target, 0, nums2.length);
                }
            }
        } else {
            for (int target : nums2) {
                if (binarySearch(nums1, target, 0, nums1.length) != -1) {
                    return binarySearch(nums1, target, 0, nums1.length);
                }
            }
        }
        return -1;
    }


    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {

            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return nums[mid];
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
