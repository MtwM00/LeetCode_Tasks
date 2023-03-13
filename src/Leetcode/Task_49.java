package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task_49 {

    /**
     * Task 49. Group Anagrams.
     *
     * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     *
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     *
     *Constraints:
     *
     * 1 <= strs.length <= 104
     * 0 <= strs[i].length <= 100
     * strs[i] consists of lowercase English letters.
     *
     */

    public static void main(String[] args) {

        Task_49 task = new Task_49();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(task.groupAnagrams(strs));

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mapa = new HashMap<String, List<String>>();

        for(String wyraz : strs) {

            char[] count = new char[26];

            for(char c : wyraz.toCharArray()){
                count[c - 'a']++;
            }
            String countStr = String.valueOf(count);

            if(mapa.get(countStr) == null) {
                mapa.put(countStr, new ArrayList<>());
            }mapa.get(countStr).add(wyraz);
        }
        return new ArrayList<>(mapa.values());
    }

}
