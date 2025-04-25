package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_143 {

    /**
     Task_143. Reorder List

     You are given the head of a singly linked-list. The list can be represented as:

     L0 → L1 → … → Ln - 1 → Ln
     Reorder the list to be on the following form:

     L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
     You may not modify the values in the list's nodes. Only nodes themselves may be changed.

     Constraints:
     The number of nodes in the list is in the range [1, 5 * 104].
     1 <= Node.val <= 1000
     */

    public static void main (String[] args) {

        Task_143 task_143 = new Task_143();

        ListNode e = new ListNode(5, null);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);



        task_143.reorderList(a);
    }

    public void reorderList(ListNode head) {

        List<ListNode> listNodes = new ArrayList<>();

        while (head != null) {
            listNodes.add(head);
            head = head.next;
        }

        int pointer1 = 0;
        int pointer2 = listNodes.size() - 1;

        while (pointer1 < pointer2) {
            listNodes.get(pointer1).next = listNodes.get(pointer2);
            pointer1++;
            if (pointer1 == pointer2) break;
            listNodes.get(pointer2).next = listNodes.get(pointer1);
            pointer2--;

        }
        listNodes.get(pointer1).next = null;
    }

    public void reorderList2Pointer(ListNode head) {

        ListNode left = head;
        ListNode right = head.next;

        while (right != null && right.next != null) {
            left = left.next;
            right = right.next.next;
        }

        ListNode second = left.next;
        left.next = null;
        ListNode prev = null;

        while (second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;

        }

        second = prev;
        ListNode first = head;

        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }

}
