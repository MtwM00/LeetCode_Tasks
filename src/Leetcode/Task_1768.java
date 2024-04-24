package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Task_1768 {

    /**
     You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
     If a string is longer than the other, append the additional letters onto the end of the merged string.
     Return the merged string.

     Constraints:
     1 <= word1.length, word2.length <= 100
     word1 and word2 consist of lowercase English letters.

     */

    public static void main(String[] args) {

        String word1 = "abcd";
        String word2 = "pq";

        Task_1768 task_1768 = new Task_1768();
        System.out.println(task_1768.mergeAlternately(word1, word2));

    }

    public String mergeAlternately(String word1, String word2) {

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        int shorterLen = 0;
        int longerLen = 0;
        String output = "";

        if(w1.length <= w2.length) {
            shorterLen = w1.length;
            longerLen = w2.length;
        } else {
            shorterLen = w2.length;
            longerLen = w1.length;
        }

        for(int i = 0; i<shorterLen; i++){
            output+=w1[i];
            output+=w2[i];

        }
        for(int i = shorterLen; i<longerLen ;i++) {
            if(w1.length <= w2.length) {
                output+=w2[i];
            } else {
                output+=w1[i];
            }
        }

        return output;
    }

}
