package Leetcode;

import java.util.Arrays;

public class Task_283 {

    /**
     Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     Note that you must do this in-place without making a copy of the array.

     Constraints:
     1 <= nums.length <= 104
     -231 <= nums[i] <= 231 - 1

     */

    public static void main(String[] args) {

        int[] nums = new int[]{0,1,3,0,12,0,13,11,17};

        Task_283 task_283 = new Task_283();
        System.out.println(Arrays.toString(nums));
        task_283.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }

    public void moveZeroes(int[] nums) {

        int l = 0;
        int r = 0;
        int temp = 0;
        while (r < nums.length) {
            if (nums[r] != 0) {
                temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }

    }

}
