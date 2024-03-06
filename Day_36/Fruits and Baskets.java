import java.util.HashMap;

public class Solution {
    public static int findMaxFruits(int []arr, int n) {
        // Write your code here.
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int j= 0, i = 0; i < n ;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            while(map.size() > 2) {
                int freq = map.get(arr[j]);
                if(freq == 1) map.remove(arr[j]);
                else map.put(arr[j], freq-1);
                j++;
            }
            ans = Math.max(ans, i-j+1);
        }
        return ans;
    }
}
    
