package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Task_383 {

    /**
     Task_383. Ransom Note

     Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
     Each letter in magazine can only be used once in ransomNote.

     Constraints:
     1 <= ransomNote.length, magazine.length <= 105
     ransomNote and magazine consist of lowercase English letters.
     */

    public static void main (String[] args) {

        Task_383 task_383 = new Task_383();

        String ransomNote = "aa";
        String magazine = "ab";

        System.out.println(task_383.canConstruct(ransomNote, magazine));

    }

    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(magazineMap.toString());

        for (char c : ransomNote.toCharArray()) {
            int count = magazineMap.getOrDefault(c, 0);
            if (count == 0) return false;
            magazineMap.put(c, count - 1);
        }
        return true;
    }

    public boolean canConstructIntArray(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) return false;

        int[] alphabet = new int[26];

        for (char c : magazine.toCharArray()) {
            alphabet[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (alphabet[c - 'a'] == 0) return false;
            alphabet[c - 'a']--;
        }

        return true;
    }
}
