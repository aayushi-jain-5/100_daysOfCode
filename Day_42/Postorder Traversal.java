/*******************************************************
 Following is the TreeNode class structure

 class TreeNode<T> {
     T data;
     TreeNode<T> left;
     TreeNode<T> right;

     public TreeNode() {
         this.data = null;
         this.left = null;
         this.right = null;
     }

     public TreeNode(T x) {
         this.data = x;
         this.left = null;
         this.right = null;
     }

     public TreeNode(T x, TreeNode<T> left, TreeNode<T> right) {
         this.data = x;
         this.left = left;
         this.right = right;
     }
 };
 *******************************************************/

import java.util.*;
public class Solution {
    public static List<Integer> postorderTraversal(TreeNode<Integer> root) {
        // Write your code here
    
        List<Integer> list = new ArrayList<>();
        PostOrder(root,list);
        return list;
    }
   
    public static void PostOrder(TreeNode<Integer> root, List<Integer> list) {
        if(root == null) {
            return;
        }
        PostOrder(root.left,list);
        PostOrder(root.right,list);
        list.add(root.data);
        
    }
    
}
  

