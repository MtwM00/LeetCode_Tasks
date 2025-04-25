package Leetcode;

public class Task_509 {

    /**
     Task_2. Add Two Numbers

     You are given two non-empty linked lists representing two non-negative integers.
     The digits are stored in reverse order, and each of their nodes contains a single digit.
     Add the two numbers and return the sum as a linked list.
     You may assume the two numbers do not contain any leading zero, except the number 0 itself.

     Constraints:
     The number of nodes in each linked list is in the range [1, 100].
     0 <= Node.val <= 9
     It is guaranteed that the list represents a number that does not have leading zeros.
     */

    public static void main (String[] args) {

        Task_509 task_509 = new Task_509();

        System.out.println(task_509.fib(5));

    }

    public int fib(int n) {

        int a = 1;
        int b = 1;
        int temp = 0;

        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                temp = a;
                a = b;
                b = temp + b;
            }
        }
        return b;
    }

}
