package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Task_3169 {

    /**
     Task_3169. Count Days Without Meetings

     You are given a positive integer days representing the total number of days an employee is available for work (starting from day 1).
     You are also given a 2D array meetings of size n where, meetings[i] = [start_i, end_i] represents the starting and ending days of meeting i (inclusive).

     Return the count of days when the employee is available for work but no meetings are scheduled.
     Note: The meetings may overlap.

     Constraints:
     1 <= days <= 109
     1 <= meetings.length <= 105
     meetings[i].length == 2
     1 <= meetings[i][0] <= meetings[i][1] <= days
    */


    public static void main (String[] args) {

        Task_3169 task_3169 = new Task_3169();

//        int[][] meetings = {{5,7}, {1,3}, {9,10}};
//        int[][] meetings = {{2,4}, {1,3}};
//        int[][] meetings = {{1, 6}};
        int[][] meetings = {{3,4},{4,8},{2,5},{3,8}};

        System.out.println(task_3169.countDays(8, meetings));

    }

    public int countDays(int days, int[][] meetings) {

        int endingIndex = 0;

        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        for (int[] meeting : meetings) {
            int startingDay = Math.max(meeting[0], endingIndex + 1);
            int finishingDay = meeting[1];
            endingIndex = Math.max(finishingDay, endingIndex);
            int len = finishingDay - startingDay + 1;
            days -= Math.max(len, 0);
        }
        return days;
    }

}
