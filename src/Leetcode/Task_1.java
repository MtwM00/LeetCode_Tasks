package Leetcode;

public class Task_1 {

    /**
    Task 1. Two Sum.

     Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     You may assume that each input would have exactly one solution, and you may not use the same element twice.
     You can return the answer in any order.

     Constraints:
     2 <= nums.length <= 104
     -109 <= nums[i] <= 109
     -109 <= target <= 109
     Only one valid answer exists.

     */

    public static void main(String[] args) {

        Task_1 task = new Task_1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = task.twoSum(nums, target);

        for (int x : result) {
            System.out.print(x + " ");
        }


    }

    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            int x = nums[i];

            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    int y = nums[j];
                    if(x+y==target){
                        int[] outcome = {i,j};
                        return outcome;
                    }
                }else continue;
            }
        }
        return null;
    }



}
