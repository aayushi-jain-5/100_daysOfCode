public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int [] rev= new int[n];
        for(int i=n-1;i>=0;i--){
            rev[n-i-1]=nums[i];
        }
        return rev;

    }
}
