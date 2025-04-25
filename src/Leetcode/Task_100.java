package Leetcode;

import java.util.Stack;

public class Task_100 {

    /**
     Task 100. Same tree

     Given the roots of two binary trees p and q, write a function to check if they are the same or not.
     Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

     Constraints:
     The number of nodes in both trees is in the range [0, 100].
     -104 <= Node.val <= 104

     */

    public static void main(String[] args) {

        Task_100 task_100 = new Task_100();

        TreeNode node2_1 = new TreeNode(2);
        TreeNode node3_1 = new TreeNode(3);
        TreeNode node1_1 = new TreeNode(1, node2_1, node3_1);

        TreeNode node2_2 = new TreeNode(2);
        TreeNode node3_2 = new TreeNode(3);
        TreeNode node1_2 = new TreeNode(1, node2_2, node3_2);


        System.out.println(task_100.isSameTree(node1_1, node1_2));
    }

    public boolean isSameTreeIterativeDFS(TreeNode p, TreeNode q) {

        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{p, q});

        while (!stack.isEmpty()) {

            TreeNode[] treeNodes = stack.pop();
            TreeNode curr1 = treeNodes[0];
            TreeNode curr2 = treeNodes[1];

            if (curr1 == null && curr2 == null) continue;
            if (curr1 == null || curr2 == null || curr1.val != curr2.val) return false;

            stack.push(new TreeNode[]{curr1.right, curr2.right});
            stack.push(new TreeNode[]{curr1.left, curr2.left});

        }
        return true;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
