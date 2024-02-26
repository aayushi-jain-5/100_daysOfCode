public class Solution {
    static boolean isKthBitSet(int n, int k) {
        // Write your code here.
        if(k==1) return (n&1 )==1;
        int x= n>>k-1;
        return (x&1)==1;
    }
}
