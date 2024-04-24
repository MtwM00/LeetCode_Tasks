package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Task_345 {

    public static void main(String[] args) {

        /**
         Given a string s, reverse only all the vowels in the string and return it.
         The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

         Constraints:
         1 <= s.length <= 3 * 105
         s consist of printable ASCII characters.

         */

        String s = "leetcode";

        Task_345 task_345 = new Task_345();
        System.out.println(task_345.reverseVowels(s));

    }

    public String reverseVowels(String s) {

        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Character> vowelsInWord= new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                vowelsInWord.add(c);
            }
        }

        int vowelsCount = vowelsInWord.size();
        String output = "";

        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                output += vowelsInWord.get(vowelsCount - 1);
                vowelsCount--;
            } else {
                output += c;
            }
        }

        return output;
    }

}
