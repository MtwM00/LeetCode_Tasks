package Leetcode;

import java.util.List;
import java.util.Stack;

public class Task_206 {

    /**
     Task_206. Reverse Linked List

     Given the head of a singly linked list, reverse the list, and return the reversed list.

     Constraints:
     The number of nodes in the list is the range [0, 5000].
     -5000 <= Node.val <= 5000
     */

    public static void main (String[] args) {

        ListNode e = new ListNode(5, null);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);

        Task_206 task_206 = new Task_206();
//        System.out.println(task_206.reverseList(a).val);
        System.out.println(task_206.reverseListRecursive(a).val);


    }

    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    public ListNode reverseListRecursive(ListNode head) {

        if (head == null) return null;

        ListNode newHead = head;
        if (head.next != null) {
            newHead = reverseListRecursive(head.next);
            head.next.next = head;
        }
        head.next = null;

        return newHead;





    }

}

