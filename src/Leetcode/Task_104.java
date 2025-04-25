package Leetcode;

import java.util.*;

public class Task_104 {

    /**
     Task 104. Maximum Depth of Binary Tree

     Given the root of a binary tree, return its maximum depth.
     A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

     Constraints:
     The number of nodes in the tree is in the range [0, 104].
     -100 <= Node.val <= 100

     */


    public static void main(String[] args) {
        TreeNode node9 = new TreeNode(9);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        TreeNode node20 = new TreeNode(20, node15, node7);
        TreeNode root = new TreeNode(3, node9, node20);

        Task_104 task_104 = new Task_104();

        System.out.println(task_104.maxDepth(root));
    }

    public int recursiveDFS(TreeNode root) {

        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int maxDepthIterativeBFS(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);

        int level = 0;

        while (!queue.isEmpty()) {

            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }

            }
            level++;

        }
        return level;
    }

    public int maxDepth(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();

        if (root != null) stack.push(root);

        while (!stack.empty()) {

            for (int i = 0; i < stack.size(); i++) {

                TreeNode node = stack.pop();
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
                System.out.println(node.val);
            }


        }

        return 0;
    }

}
