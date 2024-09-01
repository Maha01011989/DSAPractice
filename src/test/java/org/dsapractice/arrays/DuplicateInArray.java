package org.dsapractice.arrays;

public class DuplicateInArray {

    public static void main(String[] args) {

        int[] nums={3,1,3,4,2};

        System.out.println(findDuplicate(nums));

    }

    public static int findDuplicate(int[] nums) {

        int i=0;
        while(i<nums.length)
        {
            int expPos=nums[i]-1;
            if(nums[i]!=nums[expPos])
            {
               int temp=nums[expPos];
               nums[expPos]=nums[i];
               nums[i]=temp;
            }
            else {
                i++;
            }
        }
        return nums[nums.length-1];

    }
}
