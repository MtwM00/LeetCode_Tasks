package Leetcode;

public class Task_392 {

    /**
     Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
     A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
     (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

     Constraints:
     0 <= s.length <= 100
     0 <= t.length <= 104
     s and t consist only of lowercase English letters.

     */

    public static void main(String[] args) {

        String s = "abbc";
        String t = "ahbdc";

        Task_392 task_392 = new Task_392();
        System.out.println(task_392.isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int j = 0;

        if (sArr.length == 0) {
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if (tArr[i] == sArr[j]) {
                j++;
            }
            if (j == sArr.length) {
                return true;
            }
        }
        return false;
    }


    public boolean isSubsequenceWrong(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        // Longer string
        int l = 0;
        int r = tArr.length - 1;
        // Subsequence
        int l_seq = 0;
        int r_seq = sArr.length - 1;

        if (tArr.length > 0 && sArr.length == 0 || tArr.length == 0 && sArr.length == 0) return true;

        while (l < r && tArr.length > 0 && sArr.length > 0) {
            if (tArr[l] == sArr[l_seq]) {
                l_seq++;
            }
            if (tArr[r] == sArr[r_seq]) {
                r_seq--;
            }
            if (l_seq >= r_seq) {
                return true;
            }
            l++;
            r--;
        }
        return false;
    }
}
