package org.dsapractice.searching;

public class PivotElement {

    public static void main(String[] args) {

        int[] nums = {4, 0, 1, 2, 3};


        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] > nums[mid + 1]) {
                System.out.println(mid);
                break;
            } else if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
