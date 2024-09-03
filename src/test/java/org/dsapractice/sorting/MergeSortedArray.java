package org.dsapractice.sorting;

import java.util.Arrays;

import static org.dsapractice.sorting.SelectionSort.swap;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
            int j = m + i;
            while (j > 0) {
                if (nums1[j] < nums1[j - 1]) {
                    swap(nums1, j, j - 1);
                } else {
                    break;
                }
                j--;
            }
        }

        System.out.println(Arrays.toString(nums1));

    }

    public static void swapArr(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
