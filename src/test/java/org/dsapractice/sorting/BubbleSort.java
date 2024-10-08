package org.dsapractice.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 3, 5};

        for (int i = 0; i < arr.length; i++) {
            boolean sorted = true;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                System.out.println("Array is sorted in the " + i + " th iteration");
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
