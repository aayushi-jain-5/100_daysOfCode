class Solution {
    public boolean isPowerOfTwo(int n) {
        // Write your code here.
        if(n<0) return false;
         return n != 0 && ((n & (n - 1)) == 0);
    }
}
