package Leetcode;

public class Task_2 {

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

//        ListNode c = new ListNode(3, null);
//        ListNode b = new ListNode(4, c);
//        ListNode a = new ListNode(2, b);
//
//        ListNode f = new ListNode(4, null);
//        ListNode e = new ListNode(6, f);
//        ListNode d = new ListNode(5, e);

        ListNode g = new ListNode(9, null);
        ListNode f = new ListNode(9, g);
        ListNode e = new ListNode(9, f);
        ListNode d = new ListNode(9, e);
        ListNode c = new ListNode(9, d);
        ListNode b = new ListNode(9, c);
        ListNode a = new ListNode(9, b);


        ListNode k = new ListNode(9, null);
        ListNode j = new ListNode(9, k);
        ListNode i = new ListNode(9, j);
        ListNode h = new ListNode(9, i);

        Task_2 task_2 = new Task_2();
        System.out.println(task_2.addTwoNumbers(a,h));

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode sum = dummy;
        int total = 0;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            total = carry;

            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }

            carry = total / 10;
            dummy.next = new ListNode(total % 10);
            dummy = dummy.next;
        }
        return sum.next;
    }

    public ListNode addTwoNumbersW(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode sum = dummy;

        while (l1 != null && l2 != null) {
            if(l1.val + l2.val >= 10) {
                l1.val = (l1.val + l2.val) % 10;
                l1.next.val += 1;
            } else {
                l1.val = l1.val + l2.val;
            }
            sum.next = l1;
            l1 = l1.next;
            l2 = l2.next;
            sum = sum.next;
        }
        if (l1 != null) sum.next = l1;
        else sum.next = l2;

        return dummy.next;
    }
}
