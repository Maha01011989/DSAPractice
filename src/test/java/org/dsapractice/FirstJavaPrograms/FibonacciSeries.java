package org.dsapractice.FirstJavaPrograms;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFiboSeries(20)));
    }

    static int[] getFiboSeries(int x) {

        int[] arr = new int[x];

        if (x <= 0) {
            return arr;
        }

        int a = 0;
        int b = 1;
        arr[0] = a;

        if (x >= 2) {
            arr[1] = b;
            for (int i = 2; i < x; i++) {
                arr[i] = a + b;
                a = b;
                b = arr[i];
            }
        }
        return arr;
    }
}


