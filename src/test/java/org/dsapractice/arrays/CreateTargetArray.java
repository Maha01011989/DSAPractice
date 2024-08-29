package org.dsapractice.arrays;

import java.util.Arrays;

public class CreateTargetArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};

        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == index[i]) {
                target[index[i]] = nums[i];
            } else if (i > index[i]) {
                int j = i;
                while (j > index[i]) {
                    target[j] = target[j - 1];
                    j--;
                }

                target[index[i]] = nums[i];
            }

        }

        System.out.println(Arrays.toString(target));
    }
}
