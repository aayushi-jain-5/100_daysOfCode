import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int cnt=1;
        int max= -1;
        Arrays.sort(a);
        int n =a.length;
        for(int i=0;i<n-1;i++){
            if(a[i+1]-a[i]==1){
                cnt++;
            }
            else if(a[i]==a[i+1])
            continue;
            else{
                cnt=1;
            }
            max=Math.max(cnt,max);
        }
        return max;
    }
}
