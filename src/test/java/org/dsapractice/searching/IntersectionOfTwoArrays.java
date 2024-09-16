package org.dsapractice.searching;

import java.util.Arrays;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersection(arr1, arr2)));

    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] newArr;
        int j;


        if (nums1.length > nums2.length) {
            j = 0;
            insertionSort(nums1);
            newArr = new int[removeDuplicates(nums2)];
            for (int i = 0; i < removeDuplicates(nums2); i++) {
                int index = binarySearch(nums1, nums2[i], 0, nums1.length - 1);
                if (index != -1) {
                    newArr[j] = nums1[index];
                    j++;
                }
            }
        } else {
            j = 0;
            insertionSort(nums2);
            newArr = new int[removeDuplicates(nums1)];
            for (int i = 0; i < removeDuplicates(nums1); i++) {
                int index = binarySearch(nums2, nums1[i], 0, nums2.length - 1);
                if (index != -1) {
                    newArr[j] = nums2[index];
                    j++;
                }
            }
        }
        return newArr;
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

    static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j] = nums[i + 1];
                j++;
            }
        }
        return j;
    }
}
