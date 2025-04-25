package Leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Task_141 {

    /**
     Task_141. Linked List Cycle

     Given head, the head of a linked list, determine if the linked list has a cycle in it.
     There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
     Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

     Return true if there is a cycle in the linked list. Otherwise, return false.

     Constraints:
     The number of the nodes in the list is in the range [0, 104].
     -105 <= Node.val <= 105
     pos is -1 or a valid index in the linked-list.
     */

    public static void main (String[] args) {

        ListNode e = new ListNode(-4, null);
        ListNode d = new ListNode(0, e);
        ListNode c = new ListNode(2, d);
        ListNode b = new ListNode(3, c);
        e.next = c;
//        ListNode a = new ListNode(1, b);

        Task_141 task_141 = new Task_141();

        System.out.println(task_141.hasCycle(b));
//        System.out.println(task_141.hasCycle2Pointer(b));


    }

    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        while (head != null) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2Pointer(ListNode head) {

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) return true;
        }
        return false;
    }





}














