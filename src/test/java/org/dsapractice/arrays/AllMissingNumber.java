package org.dsapractice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumber {

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));


    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int i=0;
        while(i<nums.length)
        {
            int expPos=nums[i]-1;

            if(nums[i]!=nums[expPos]) {

                    int temp = nums[expPos];
                    nums[expPos] = nums[i];
                    nums[i] = temp;
                }

            else {
                i++;
            }
        }



        List<Integer> li=new ArrayList<>();

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                li.add(j+1);
            }
        }

        return li;

    }


}
