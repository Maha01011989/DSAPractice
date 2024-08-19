package org.dsapractice.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductArray {

    public static void main(String[] args) {


        int[] num = {1, 2, 3,4};

        int[] ans = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            int j = 0;
            int p = 1;

            while (j < num.length) {
                if (j == i) {
                    j++;
                }
                p = p * num[j];
                j++;
                if (i == num.length - 1 && j == num.length - 1) {
                    break;
                }
            }

            ans[i] = p;
        }

        System.out.println(Arrays.toString(ans));
    }
}
