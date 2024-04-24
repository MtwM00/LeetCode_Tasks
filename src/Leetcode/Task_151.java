package Leetcode;

public class Task_151 {

    public static void main(String[] args) {

        /**
         Given an input string s, reverse the order of the words.
         A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
         Return a string of the words in reverse order concatenated by a single space.
         Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

         Constraints:
         1 <= s.length <= 104
         s contains English letters (upper-case and lower-case), digits, and spaces ' '.
         There is at least one word in s.

         */

        String s = "  hello world  ";

        Task_151 task_151 = new Task_151();
        System.out.println(task_151.reverseWords(s));

    }

    public String reverseWords(String s) {

        String[] wordsArray = s.split(" ");
        String output = "";

        for (int i = wordsArray.length - 1; i >= 0 ; i--) {
            if (!wordsArray[i].isBlank()) {
                output += wordsArray[i];
                output += " ";
            }
        }

        return output.strip();
    }
}
