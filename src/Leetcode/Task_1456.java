package Leetcode;

import java.util.List;

public class Task_1456 {

    /**
     * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
     * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
     *
     * Constraints:
     * 1 <= s.length <= 105
     * s consists of lowercase English letters.
     * 1 <= k <= s.length
     *
     */

    public static void main(String[] args) {

//        String s = "abciiidef";
//        int k = 3;

//        String s = "aeiou";
//        int k = 2;

        String s = "leetcode";
        int k = 2;

        Task_1456 task_1456 = new Task_1456();
        System.out.println(task_1456.maxVowels(s, k));


    }

    public int maxVowels(String s, int k) {

        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        char[] array = s.toCharArray();
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.contains(array[i])) {
                count++;
            }
        }
        int maxCount = count;

        for (int i = k; i < array.length; i++) {
            if (vowels.contains(array[i])) {
                count++;
            }
            if (vowels.contains(array[i-k])) {
                count--;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }

}
