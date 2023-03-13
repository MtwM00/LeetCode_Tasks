package Leetcode;

public class Task_125 {

    /**
     * Task 125. Valid Palindrome.
     *
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
     * Alphanumeric characters include letters and numbers.
     * Given a string s, return true if it is a palindrome, or false otherwise.
     *
     * Constraints:
     * 1 <= s.length <= 2 * 105
     * s consists only of printable ASCII characters.
     *
     * */

    public static void main(String[] args) {

        Task_125 task = new Task_125();
        String s = "A man, a plan, a canal: Panama";

        System.out.println(task.isPalindrome(s));

    }

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        // Remove all non-alphanumeric characters
        s = s.replaceAll("[^a-z0-9]", "");

        int len = s.length();

        for(int i = 0 ; i < len; i++){
            if(s.charAt(i) != s.charAt(len - i - 1)){
                return false;
            }
        }
        return true;
    }

}
