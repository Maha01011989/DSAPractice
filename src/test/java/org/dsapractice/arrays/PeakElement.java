package org.dsapractice.arrays;

public class PeakElement {

    public static void main(String[] args) {
        int arr[] = {10, 20, 15, 2, 23, 90, 67};
        System.out.println(findOrder(arr));
        System.out.println(getPeakElement(arr));
    }

    public static String findOrder(int[] arr) {
        int ascCount = 0;
        int descCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                ascCount++;
            } else if (arr[i] > arr[i + 1]) {
                descCount++;
            }
        }
        if (ascCount == arr.length - 1) {
            return "Ascending";
        } else if (descCount == arr.length - 1) {
            return "Descending";
        }
        return "Ascending nor Descending";
    }

    public static int getPeakElement(int[] arr) {
        {
            if (findOrder(arr).equalsIgnoreCase("Ascending")) {
                return arr[arr.length - 1];
            } else if (findOrder(arr).equalsIgnoreCase("Descending")) {
                return arr[0];
            } else {
                for (int i = 1; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                        return arr[i];
                    }
                }
            }
        }
        return -1;
    }
}
