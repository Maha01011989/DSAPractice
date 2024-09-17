package org.dsapractice.arrays;

import java.util.Arrays;

public class PLusOne {

    public static void main(String[] args) {

        int[] nums = {9, 9, 9, 2};

        System.out.println(Arrays.toString(plusOne(nums)));

    }

    public static int[] plusOne(int[] digits) {
        int newArr[] = new int[digits.length + 1];

        int i = digits.length - 1;
        digits[i] += 1;


        while (i >= 1 && digits[i] == 10) {
            digits[i] = 0;
            digits[i - 1] += 1;
            i--;
        }

        if (digits[0] == 10) {
            newArr[0] = 1;
            return newArr;
        }
        return digits;
    }
}
