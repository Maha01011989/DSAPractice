package org.dsapractice.arrays;

public class EvenNumbers {

    public static void main(String[] args) {
        int evenCount = 0;
        int[] nums = {555,901,482,1771};
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println(evenCount);
    }
}
