package org.dsapractice.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductArray {

    public static void main(String[] args) {


        int[] num = {1, 2, 3, 4};

        int[] ans = new int[num.length];

        for (int i = 0; i < num.length; i++) {

            int p = 1;
            for (int j = 0; j < num.length; j++) {
                if (j == i) {
                    continue;
                }
                p = p * num[j];
            }

            ans[i] = p;
        }

        System.out.println(Arrays.toString(ans));
    }
}
