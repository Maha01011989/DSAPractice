class Solution {
    public int[] moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0)
                continue;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == 0)
                    continue;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }

        return nums;


    }
}

        