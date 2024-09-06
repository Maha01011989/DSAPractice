package org.dsapractice.sorting;

import java.util.Arrays;

public class KthLargestElement {


    public static void main(String[] args) {

        int[] nums = {5,2,4,1,3,6,0};

        int k =4;

        System.out.println(bubbleSort(nums, k));
    }


    static int bubbleSort(int[] arr, int k) {
        int i = 0;
        while (i < k) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }
            }
            i++;
        }
        return arr[arr.length - k];
    }
}






