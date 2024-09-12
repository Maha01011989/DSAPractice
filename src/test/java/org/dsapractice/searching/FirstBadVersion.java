package org.dsapractice.searching;

import java.util.Arrays;

public class FirstBadVersion {

    public static void main(String[] args) {

        System.out.println(firstBadVersion(2126753390));
    }

    public static int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start == end) {
                return start;
            }
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }

    public static int[] getArray(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        return arr;

    }

    public static boolean isBadVersion(int n) {
        if (n >= 1702766719) {
            return true;
        } else {
            return false;
        }
    }
}
