/************************************************************

 Following is the BinaryTreeNode class structure
 class BinaryTreeNode<T>
 {
     public:
     T data;
     BinaryTreeNode<T> left;
     BinaryTreeNode<T> right;
    
     BinaryTreeNode(T data)
     {
         this.data = data;
         left = null;
         right = null;
     }
 };
 ************************************************************/
public class Solution {
    public static int max=Integer.MIN_VALUE;
    public static int maxPathSum(BinaryTreeNode<Integer> root) {
        // Write your code here
        maxp(root);
        return max;
    }
    public static int maxp(BinaryTreeNode<Integer>root){
        if(root==null) return 0;
        int data=root.data;

        int left=Math.max(maxp(root.left),0);
        int right= Math.max(maxp(root.right),0);

        max=Math.max(max,(left+right+data));

        return Math.max(left,right)+data;
    }
}
