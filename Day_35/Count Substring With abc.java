public class Solution {
    public static int countSubstring(String s){
        // Write your code here.
        int[] track = new int[3]; 
        int res = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            track[s.charAt(i) - 'a']++;

            while (track[0] > 0 && track[1] > 0 && track[2] > 0) {
                res += s.length() - i;
                track[s.charAt(left++) - 'a']--;
            }
        }
        return res;
    }
}
