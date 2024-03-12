/************************************************************

 Following is the TreeNode class structure

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 ************************************************************/

public class Solution {
    public static int heightOfBinaryTree(TreeNode root) {
        // Write your code here.
         if(root==null) return 0;
        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);
        return  1+Math.max(leftHeight,rightHeight);
    }
}
