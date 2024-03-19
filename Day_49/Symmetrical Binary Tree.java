/*
    Time Complexity:O(N). 
    Space Complexity:O(N).
    Where N is the total number of nodes in the tree.
*/

import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    public static boolean isSymmetric(TreeNode<Integer> root) {

        // If root is null, then simply return true.
        if (root == null) {
            return true;
        }

        // Create a queue which will contain the nodes of the binary tree.
        Queue<TreeNode<Integer>> q = new LinkedList<>();

        // Push the root two times to the queue initially.
        q.add(root);
        q.add(root);

        while (!q.isEmpty()) {

            // Pop two elements from the queue
            TreeNode<Integer> node1 = q.poll();

            TreeNode<Integer> node2 = q.poll();

            // If both the nodes are null, then go back to the previous step.
            if (node1 == null && node2 == null) {
                continue;
            }

            // If only one of them is null, then simply return false.
            if (node1 == null || node2 == null) {
                return false;
            }

            // If the values of two nodes don't match, then simply return false.
            if (!node1.data.equals(node2.data)) {
                return false;
            }

            // Add the left child of node1, right child of node2, right child of node1 and
            // left child of node2 to the queue in exact order.
            q.add(node1.left);
            q.add(node2.right);
            q.add(node1.right);
            q.add(node2.left);
        }

        return true;

    }
}
