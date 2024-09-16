package org.dsapractice.arrays;

import java.util.Arrays;

public class StringReverseArr {

    public static void main(String[] args) {

        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        int i = 0;
        while (i < arr.length / 2) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                char temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
