package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Task_1431 {

    /**
     There are n kids with candies.
     You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
     Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

     Note that multiple kids can have the greatest number of candies.

     Constraints:
     n == candies.length
     2 <= n <= 100
     1 <= candies[i] <= 100
     1 <= extraCandies <= 50

     */

    public static void main(String[] args) {

        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;

        Task_1431 task_1431 = new Task_1431();
        System.out.println(task_1431.kidsWithCandies(candies, extraCandies));


    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> kidsList = new ArrayList<>();
        int max = 0;

        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }

        for (int i : candies) {
            if (i + extraCandies >= max) {
                kidsList.add(true);
            } else {
                kidsList.add(false);
            }

        }


        return kidsList;
    }

}
