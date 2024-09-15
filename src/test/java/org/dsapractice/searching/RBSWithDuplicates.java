package org.dsapractice.searching;

import javax.swing.*;

public class RBSWithDuplicates {

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;

        System.out.println(search(nums, target));
    }

    public static boolean search(int[] nums, int target) {

        if (findPivotWithDuplicates(nums) == -1) {
            if (binarySearch(nums, target, 0, nums.length - 1) != -1) {
                return true;
            } else {
                return false;
            }
        }
        if (nums[findPivotWithDuplicates(nums)] == target) {
            return true;
        }
        if (binarySearch(nums, target, 0, findPivotWithDuplicates(nums) - 1) != -1) {
            return true;
        } else if (binarySearch(nums, target, findPivotWithDuplicates(nums) + 1, nums.length - 1) != -1) {
            return true;
        } else {
            return false;
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


    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
