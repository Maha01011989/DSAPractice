package org.dsapractice.searching;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        ans[0] = getThePosition(nums, target, true);
        if (ans[0] >= 0)
            ans[1] = getThePosition(nums, target, false);
        return ans;

    }

    public static int getThePosition(int[] nums, int target, boolean IsStartingPosition) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (IsStartingPosition) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}





