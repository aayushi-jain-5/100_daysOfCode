import java.util.* ;
import java.io.*; 
/*************************************************************
 
    Following is the Binary Tree node structure

    class BinaryTreeNode<T> {
        public T data;
        public BinaryTreeNode<T> *left;
        public BinaryTreeNode<T> *right;

        BinaryTreeNode(T data) {
            this.data = data;
            left = NULL;
            right = NULL;
        }
    };

*************************************************************/

public class Solution {
    public static int countNodes(BinaryTreeNode<Integer> root) {
        // Write your code here.
        if(root==null)return 0;
        else if(root.right==null)
        return countNodes(root.left)+1;
        else if(root.left==null)
        return countNodes(root.right)+1;
        else return countNodes(root.left) + countNodes(root.right)+1;
      }
}
