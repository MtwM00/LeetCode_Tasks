package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Task_228 {

    /**
     Task_228. Summary ranges.

     You are given a sorted unique integer array nums.
     A range [a,b] is the set of all integers from a to b (inclusive).
     Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
     That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
     Each range [a,b] in the list should be output as:

     "a->b" if a != b
     "a" if a == b

     Constraints:
     0 <= nums.length <= 20
     -231 <= nums[i] <= 231 - 1
     All the values of nums are unique.
     nums is sorted in ascending order.
     */

    public static void main (String[] args) {

        Task_228 task_228 = new Task_228();

        int[] nums = {0,1,2,4,5,7};
//        int[] nums = {0,2,3,4,6,8,9};

        System.out.println(task_228.summaryRanges(nums));
    }

    public List<String> summaryRanges(int[] nums) {

        int pointer = 0;
        List<String> listOfRanges = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {

                StringBuilder sb = new StringBuilder();
                sb.append(nums[pointer]);
                if (pointer != i - 1) {
                    sb.append("->").append(nums[i - 1]);
                }
                listOfRanges.add(sb.toString());
                pointer = i;
            }
        }
        return listOfRanges;

    }

}
