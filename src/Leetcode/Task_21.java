package Leetcode;

public class Task_21 {

    /**
     Task_21. Merge Two Sorted Lists

     You are given the heads of two sorted linked lists list1 and list2.
     Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
     Return the head of the merged linked list.

     Constraints:
     The number of nodes in both lists is in the range [0, 50].
     -100 <= Node.val <= 100
     Both list1 and list2 are sorted in non-decreasing order.
     */

    public static void main (String[] args) {

        Task_21 task_21 = new Task_21();

        ListNode c = new ListNode(6, null);
        ListNode b = new ListNode(4, c);
        ListNode a = new ListNode(2, b);

        ListNode f = new ListNode(5, null);
        ListNode e = new ListNode(1, f);
        ListNode d = new ListNode(1, e);

        System.out.println(task_21.mergeTwoLists(a, d));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {

            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;

        }
        if (list1 != null) tail.next = list1;
        else tail.next = list2;


        return dummy.next;
    }

}
