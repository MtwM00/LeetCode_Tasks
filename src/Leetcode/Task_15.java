package Leetcode;

import java.util.*;

public class Task_15 {

    /**
     Task 15. 3Sum

     Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     Notice that the solution set must not contain duplicate triplets.

     Constraints:
     3 <= nums.length <= 3000
     -105 <= nums[i] <= 105

     */

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};
//        int[] nums = {0,0,0,0};
//        int[] nums = {-2,0,1,1,2};
        Task_15 task_15 = new Task_15();

        System.out.println(task_15.threeSum(nums));

    }

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> resultList = new HashSet<>();

        Arrays.sort(nums);

        for (int constant = 0; constant < nums.length - 2; constant++) {
            int sum = 0 - nums[constant];
            int l = constant + 1;
            int r = nums.length - 1;

            while (l < r) {
                if (nums[l] + nums[r] > sum) {
                    r--;
                } else if (nums[l] + nums[r] < sum) {
                    l++;
                } else {
                    resultList.add(List.of(nums[constant], nums[l], nums[r]));
                    l++;
                    r--;
                }
            }
        }
        return new ArrayList<>(resultList);
    }

}
