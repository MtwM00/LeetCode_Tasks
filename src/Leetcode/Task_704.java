package Leetcode;

public class Task_704 {

    /**
     Task_704. Binary Search

     Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
     If target exists, then return its index. Otherwise, return -1.
     You must write an algorithm with O(log n) runtime complexity.

     Constraints:
     1 <= nums.length <= 104
     -104 < nums[i], target < 104
     All the integers in nums are unique.
     nums is sorted in ascending order.
     */

    public static void main (String[] args) {

        Task_704 task_704 = new Task_704();
//        int[] nums = {-1,0,3,5,9,12,15};
        int[] nums = {5};
        int target = 5;

        System.out.println(task_704.search(nums, target));

    }

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == target) {
                return left;
            }
            if (nums[right] == target) {
                return right;
            }
            left++;
            right--;

        }
        return -1;
    }

}
