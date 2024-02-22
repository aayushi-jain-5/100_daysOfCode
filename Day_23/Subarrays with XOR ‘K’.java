import java.util.HashMap;

public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        int xr=0;
        mp.put(xr,1);
        Integer cnt=0;
        for(int i=0;i<a.length;i++){
            xr=xr^a[i];

            int x= xr^b;
            if (mp.containsKey(x)) {
                cnt += mp.get(x);
            }

            if (mp.containsKey(xr)) {
                mp.put(xr, mp.get(xr) + 1);
            } else {
                mp.put(xr, 1);
            }
        }
        return cnt;
    }
}
