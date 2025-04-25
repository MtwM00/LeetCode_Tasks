package Leetcode;

import java.util.*;

public class Task_20 {

    /**
     Task_20. Valid Parentheses

     Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

     An input string is valid if:
     Open brackets must be closed by the same type of brackets.
     Open brackets must be closed in the correct order.
     Every close bracket has a corresponding open bracket of the same type.

     Constraints:
     1 <= s.length <= 104
     s consists of parentheses only '()[]{}'.
     */

    public static void main (String[] args) {

        Task_20 task_20 = new Task_20();

        String s = "([])";
        System.out.println(task_20.isValid(s));


    }

    public boolean isValid(String s) {

        Map<Character, Character> closeOpenMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        closeOpenMap.put(')', '(');
        closeOpenMap.put(']', '[');
        closeOpenMap.put('}', '{');

        for (char c: s.toCharArray()) {
            // Checking if c is an closing parentheses
            if (closeOpenMap.containsKey(c)) {
                // Making sure that stack is not empty and checking if last character in the stack is a matching opening parentheses
                if (!stack.empty() && stack.peek() == closeOpenMap.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }


}
