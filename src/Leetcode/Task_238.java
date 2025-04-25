package Leetcode;

import java.util.Arrays;

public class Task_238 {

    /**
     Task 238. Product of Array Except Self

     Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     You must write an algorithm that runs in O(n) time and without using the division operation.

     Constraints:
     2 <= nums.length <= 105
     -30 <= nums[i] <= 30
     The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

     */

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        Task_238 task_238 = new Task_238();

        System.out.println(Arrays.toString(task_238.productExceptSelf(nums)));
    }

    public int[] productExceptSelfDivision(int[] nums) {

        // 0 not working

        int[] productArr = new int[nums.length];
        int product = 1;

        for (int i : nums) {
            product *= i;
        }

        for (int i = 0; i < productArr.length; i++) {
            productArr[i] = product / nums[i];
        }

        return productArr;
    }

    // 1  2  3 4
    // 24 12 8 6

    public int[] productExceptSelf(int[] nums) {

        int[] productArr = new int[nums.length];
        productArr[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            productArr[i] = productArr[i - 1] * nums[i];
        }
        int postfix = 1;

        for (int i = nums.length - 1; i > 0; i--) {
            productArr[i] = postfix * productArr[i-1];
            postfix = postfix*nums[i];
        }
        productArr[0] = postfix;

        return productArr;
    }
}
