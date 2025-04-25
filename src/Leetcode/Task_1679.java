package Leetcode;

import java.util.Arrays;

public class Task_1679 {

    /**
     * You are given an integer array nums and an integer k.
     * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
     *
     * Return the maximum number of operations you can perform on the array.
     *
     * Constraints:
     * 1 <= nums.length <= 105
     * 1 <= nums[i] <= 109
     * 1 <= k <= 109
     */

    public static void main(String[] args) {

        int[] nums = new int[]{3,1,3,4,3};
        int k = 5;

        Task_1679 task_1679 = new Task_1679();
        System.out.println(task_1679.maxOperations(nums, k));

    }

    public int maxOperations(int[] nums, int k) {

        int l = 0;
        int r = nums.length - 1;
        int count = 0;
        Arrays.sort(nums);

        while (l < r) {
            if (nums[l] + nums[r] == k) {
                count++;
                l++;
                r--;
            }
            else if (nums[l] + nums[r] > k) {
                r--;
            } else {
                l++;
            }
        }
        return count;
    }

}
