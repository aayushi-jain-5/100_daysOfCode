/*************************************************************

     Following is thr TreeNode class structure

     class BinaryTreeNode<T>
     {
         T data;
         BinaryTreeNode<T> left;
         BinaryTreeNode<T> right;

         BinaryTreeNode(T data) {
             this.data = data;
             left = null;
             right = null;
         }
     };

 *************************************************************/

 import java.util.*;
public class Solution {
    public static boolean isBalancedBT(TreeNode<Integer> root) {
        // Write your code here.
        if(root==null) return true;
        return height(root)!=-1;
        
    }
    public static int height(TreeNode<Integer> node){
        if(node==null) return 0;
        int left= height(node.left);
        int right = height(node.right);
        int bf = Math.abs(left - right);

        if( left == -1 || right == -1)
            return -1;
            if(bf<=1){
                return 1+ Math.max(left,right);
            }
            return -1;

        
        
    }
    
}
