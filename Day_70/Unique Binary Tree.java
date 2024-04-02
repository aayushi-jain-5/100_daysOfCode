public class Solution {
    public static boolean uniqueBinaryTree(int a, int b){
        // Write your code here.
        if(Math.abs(a-b)>1) return false;
        if(a!=b)return true;
        return false;
    }
}
