package Leetcode;

public class Task_33 {

    /**
     Task 33. Search in Rotated Sorted Array

     There is an integer array nums sorted in ascending order (with distinct values).

     Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
     such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
     For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].


     Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

     You must write an algorithm with O(log n) runtime complexity.

     */

    public static void main(String[] args) {
        Task_33 task_33 = new Task_33();
//        int[] nums = {4,5,6,7,0,1,2};
        int[] nums = {1,3};
        int target = 2;

        System.out.println(task_33.search(nums, target));
    }

    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int middle = (l + r) / 2;

            if (nums[middle] == target) return middle;

            //left sorted part of array
            if (nums[middle] >= nums[l]) {
                if (target > nums[middle] || target < nums[l]) {
                    l = middle + 1;
                } else {
                    r = middle - 1;
                }
            }
            //right sorted part of array
            else {
                if (target < nums[middle] || target > nums[r]) {
                    r = middle - 1;
                } else {
                    l = middle + 1;
                }
            }
        }
        return -1;
    }

}
