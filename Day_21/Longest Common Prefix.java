import java.util.*;
public class Solution {

    public static String commonPrefix(String []strs,int n){
        //Write your code here
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[n-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        if(idx>0)
        return s1.substring(0, idx);
        else return "-1";
    }
}
