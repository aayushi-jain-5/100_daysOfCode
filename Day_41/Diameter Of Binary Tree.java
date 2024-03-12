/*************************************************************

 Following is the Binary Tree Node structure:

 class TreeNode<T> {
     public T data;
     public BinaryTreeNode<T> left;
     public BinaryTreeNode<T> right;

     TreeNode(T data) {
         this.data = data;
         left = null;
         right = null;
     }
 }

 *************************************************************/
import java.util.*;
public class Solution {

public static int res=0;
    public static int diameterOfBinaryTree(TreeNode<Integer> root) {
        // Write your code here.
        // int res=0;
        maxHeight(root);
        return res;
    }

    public static int maxHeight(TreeNode<Integer> root) {
        if (root==null) return 0;

        int x = maxHeight(root.left);
        int y = maxHeight(root.right);

        res = Math.max(res, x+y);

        return Math.max(x,y) + 1;
    }
    
}
