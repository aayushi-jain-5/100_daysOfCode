/*******************************************************

 Following is the BinaryTreeNode class structure:

 class BinaryTreeNode<T> {
     T data;
     BinaryTreeNode<T> left;
     BinaryTreeNode<T> right;

     public BinaryTreeNode(T data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 *******************************************************/

public class Solution {
    public static boolean identicalTrees(BinaryTreeNode<Integer> p, BinaryTreeNode<Integer> q) {
        // Write you code here.
        if(p== null || q==null) {
            return p==q;
        }
        return (p.data==q.data) && identicalTrees(p.left, q.left) && identicalTrees(p.right,q.right);
    }
}
