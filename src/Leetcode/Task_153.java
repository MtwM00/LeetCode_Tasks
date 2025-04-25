package Leetcode;

public class Task_153 {

    /**
     Task 153. Find Minimum in Rotated Sorted Array

     Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

     [4,5,6,7,0,1,2] if it was rotated 4 times.
     [0,1,2,4,5,6,7] if it was rotated 7 times.
     Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

     Given the sorted rotated array nums of unique elements, return the minimum element of this array.
     You must write an algorithm that runs in O(log n) time.

     Constraints:
     n == nums.length
     1 <= n <= 5000
     -5000 <= nums[i] <= 5000
     All the integers of nums are unique.
     nums is sorted and rotated between 1 and n times.

     */

    public static void main(String[] args) {

        Task_153 task_153 = new Task_153();

//        int[] nums = {11,13,15,17};
        int[] nums = {12, 11};

        System.out.println(task_153.findMin(nums));

    }

    // O(n)

    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r && nums.length > 1) {
            if (!(nums[l] < nums[l+1])) {
                return nums[l+1];
            }
            if (!(nums[r] > nums[r-1])) {
                return nums[r];
            }
            l++;
            r--;
        }
        return nums[0];
    }

    // O(log n)

    public int findMin2(int[] nums) {

        int l = 0;
        int r = nums.length - 1;
        int result = nums[0];

        while (l <= r) {
            if (nums[l] < nums[r]) {
                result = Math.min(result, nums[l]);
            }
            int middle = (l + r) / 2;
            result = Math.min(result, nums[middle]);
            if (nums[middle] >= nums[l]) {
                l = middle + 1;
            } else {
                r = middle - 1;
            }
        }
        return result;
    }
}
