package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Task_242 {

    /**
     * Task 242. Valid Anagram.
     *
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     *
     * Constraints:
     * 1 <= s.length, t.length <= 5 * 104
     * s and t consist of lowercase English letters.
     *
     * */

    public static void main(String[] args) {

        Task_242 task = new Task_242();
        String s = "anagram";
        String t = "nagaram";

        System.out.println(task.isAnagram(s, t));

    }

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapa1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapa2 = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){

            if(mapa1.containsKey(s.charAt(i))){
                mapa1.replace(s.charAt(i), mapa1.get(s.charAt(i)) + 1);
            }else {
                mapa1.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(mapa2.containsKey(t.charAt(i))){
                mapa2.replace(t.charAt(i), mapa2.get(t.charAt(i)) + 1);
            }else {
                mapa2.put(t.charAt(i), 1);
            }
        }

        if (mapa1.equals(mapa2)){
            return true;
        }else {
            return false;
        }
    }

    public boolean isAnagramAlternative(String s, String t) {
        List<Character> lista1 = new ArrayList<>();
        List<Character> lista2 = new ArrayList<>();

        for (int i = 0; i<s.length(); i++){
            lista1.add(s.charAt(i));
        }
        for (int j = 0; j<t.length(); j++){
            lista2.add(t.charAt(j));
        }
        Collections.sort(lista1);
        Collections.sort(lista2);

        if(lista1.equals(lista2)){
            return true;
        }else {
            return false;
        }
    }

}
