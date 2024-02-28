public class Solution {
    public static long getTrappedWater(long []h, int n) {
        // Write your code here.
        
        int l = 0, r = h.length - 1; long lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE, ans = 0;
        while (l < r) {
        lmax = Math.max(lmax, h[l]);
        rmax = Math.max(rmax, h[r]);
        ans += (lmax < rmax) ? lmax - h[l++] : rmax - h[r--];
        }
        return ans;
    }
}
    
