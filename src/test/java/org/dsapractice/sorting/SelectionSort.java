package org.dsapractice.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int start = getMaxIndex(arr, 0, last);
            System.out.println(start);
            swap(arr, start, last);

            System.out.println(Arrays.toString(arr));
        }

    }


    static int getMaxIndex(int[] arr, int start, int last) {
        int max = arr[start];
        int maxIndex = start;
        for (int i = 1; i <= last; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }

        }
        return maxIndex;
    }

    static void swap(int[] arr, int start, int last) {

        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }

}
