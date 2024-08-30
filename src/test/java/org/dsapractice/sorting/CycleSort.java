package org.dsapractice.sorting;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {

        int[] arr = {4, 5, 1, 2, 3};


        int i = 0;
        while (i < arr.length) {
            int expPos = arr[i] - 1;

            if (arr[i] != i + 1) {
                int temp = arr[expPos];
                arr[expPos] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
