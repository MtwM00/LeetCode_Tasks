package Leetcode;

public class Task_443 {

    /**
     Given an array of characters chars, compress it using the following algorithm:

     Begin with an empty string s. For each group of consecutive repeating characters in chars:
     If the group's length is 1, append the character to s.
     Otherwise, append the character followed by the group's length.
     The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
     After you are done modifying the input array, return the new length of the array.
     You must write an algorithm that uses only constant extra space.

     Constraints:
     1 <= chars.length <= 2000
     chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.

     */

    public static void main(String[] args) {

        char[] chars = new char[]{'a','b','b','b','b','b','b','b','b','b','b'};

        Task_443 task_443 = new Task_443();
        System.out.println(task_443.compress(chars));
    }

    public int compress(char[] chars) {

        int count = 1;
        String output = "";

        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i] == chars[i+1]) {
                count++;
            }
            else {
                output += chars[i];
                if (count != 1) {
                    output += count;
                    count = 1;
                }
            }
        }

        char[] outputAr = output.toCharArray();

        for (int i = 0; i <outputAr.length; i++) {
            chars[i] = outputAr[i];
        }
        return outputAr.length;
    }
}
