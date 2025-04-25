package Leetcode;

import java.util.Arrays;

public class Task_643 {

    /**
     * <p>You are given an integer array nums consisting of n elements, and an integer k.
     * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
     *
     * <p> Constraints:
     * <p> n == nums.length
     * <p> 1 <= k <= n <= 10^5
     * <p> -10^4 <= nums[i] <= 10^4
     *
     */

    public static void main(String[] args) {

        int[] nums = new int[]{1,12,-5,-6,50,50};
//        int[] nums = new int[]{-4};
        int k = 4;

        Task_643 task_643 = new Task_643();
        System.out.println(task_643.findMaxAverage(nums, k));

    }

    public double findMaxAverage(int[] nums, int k) {

        double avg = 0;
        double maxAvg = -100000;

        for (int i = 0; i < nums.length; i++) {
            avg += nums[i];
            if (i >= k - 1) {
                maxAvg = Math.max(avg/k, maxAvg);
                avg -= nums[i - k + 1];
            }
        }
        return maxAvg;
    }


    public double findMaxAverageTooSlow(int[] nums, int k) {

        int iter = nums.length - k + 1;
        double avg = 0;
        double maxAvg = -100000;

        for (int i = 0; i < iter; i++) {
            for (int j = 0 + i; j < k + i; j++) {
                avg += nums[j];
            }
            maxAvg = Math.max(avg/k, maxAvg);
            avg = 0;
        }
        return maxAvg;
    }

}
