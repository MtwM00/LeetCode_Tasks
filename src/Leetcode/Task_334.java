package Leetcode;

public class Task_334 {

    public static void main(String[] args) {

        /**
         Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

         Constraints:
         1 <= nums.length <= 5 * 105
         -231 <= nums[i] <= 231 - 1
         */


        int[] nums = new int[]{20,100,10,12,5,13};

        Task_334 task_334 = new Task_334();
        System.out.println(task_334.increasingTriplet(nums));

    }

    public boolean increasingTripletOneByOne(int[] nums) {

        int a = nums[0];
        int b = nums[1];

        for (int i = 2; i < nums.length; i++) {
            if (a < b && b < nums[i]) {
                return true;
            }
            a = b;
            b = nums[i];
        }
        return false;
    }

    public boolean increasingTripletTooSlow(int[] nums) {

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] > nums[i] && j != nums.length - 1) {
                    for (int k = j + 1; k < nums.length; k++){
                        if (nums[k] > nums[j]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean increasingTriplet(int[] nums) {

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= a) {
                a = n;
            } else if (n <= b) {
                b = n;
            } else {
                return true;
            }
        }
        return false;
    }


}
