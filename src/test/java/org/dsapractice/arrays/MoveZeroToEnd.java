package org.dsapractice.arrays;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {


        int[] nums = {1, 0, 0, 1, 0, 2, 3, 0, 0, 4};

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0)
                continue;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == 0)
                    continue;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }

        System.out.println(Arrays.toString(nums));


    }

}
