package Leetcode;

import java.util.*;

public class Task_2215 {

    /**
     Task_2. Add Two Numbers

     You are given two non-empty linked lists representing two non-negative integers.
     The digits are stored in reverse order, and each of their nodes contains a single digit.
     Add the two numbers and return the sum as a linked list.
     You may assume the two numbers do not contain any leading zero, except the number 0 itself.

     Constraints:
     The number of nodes in each linked list is in the range [1, 100].
     0 <= Node.val <= 9
     It is guaranteed that the list represents a number that does not have leading zeros.
     */

    public static void main (String[] args) {

        Task_2215 task_2215 = new Task_2215();

        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        System.out.println(task_2215.findDifference(nums1, nums2));

    }

    public List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {
        return Arrays.asList(getUniqueElementsInOneList(nums1, nums2), getUniqueElementsInOneList(nums2, nums1));
    }

    public List<Integer> getUniqueElementsInOneList(int[] nums1, int[] nums2) {

        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> existInOtherArray = new HashSet<>();

        for (int n : nums2) {
            existInOtherArray.add(n);
        }
        for (int n : nums1) {
            if (!existInOtherArray.contains(n)) {
                uniqueElements.add(n);
            }
        }
        return new ArrayList<>(uniqueElements);
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        boolean contain = false;

        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    contain = true;
                    break;
                }
            }
            if (!contain) set1.add(i);
            else contain = false;
        }
        for (int i : nums2) {
            for (int j : nums1) {
                if (i == j) {
                    contain = true;
                    break;
                }
            }
            if (!contain) set2.add(i);
            else contain = false;
        }
        return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));
    }




    }
