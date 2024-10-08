package org.dsapractice.searching;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {23, 12, 3, 45}, {89, 6, 56, 4, 10}, {0, -1, 9}};
        int target = 0;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{-1, -1};
    }
}
