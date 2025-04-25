package Leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task_226 {

    /**
     Task 226. Invert Binary Tree

     Given the root of a binary tree, invert the tree, and return its root.

     Constraints:
     The number of nodes in the tree is in the range [0, 104].
     -100 <= Node.val <= 100

     */

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node9 = new TreeNode(9);
        TreeNode node2 = new TreeNode(2, node1, node3);
        TreeNode node7 = new TreeNode(7, node6, node9);
        TreeNode root = new TreeNode(4, node2, node7);

        Task_226 task_226 = new Task_226();

        printTree(root);
        System.out.println();
        System.out.println(task_226.invertTree(root));
        printTree(root);
    }

    public TreeNode invertTreeBFS(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        if (root != null) q.offer(root);

        while (!q.isEmpty()) {

            TreeNode current = q.poll();
            TreeNode temp = current.left;

            current.left = current.right;
            current.right = temp;

            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }

        }
        return root;
    }

    public TreeNode invertTreeRecursiveDFS(TreeNode root) {

        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }

    public TreeNode invertTree(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        if (root != null) stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
        return root;
    }

    public static void printTree(TreeNode node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.val + " ");
            printTree(node.right);
        }
    }
}
