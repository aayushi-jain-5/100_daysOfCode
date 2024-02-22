import java.util.*;
public class Solution {

    public static boolean place(int[]stalls,int dist,int k){
        int cnt =1;
        int last=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=dist){
                cnt++;
                last=stalls[i];

            }
            if(cnt>=k) return true;
        }
        return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int n= stalls.length;
        int low=0;
        int high=stalls[n-1]-stalls[0];
        while(low<=high){
            int mid=(high+low)/2;
            if(place(stalls,mid,k)==true)
            low=mid+1;
            else
            high=mid-1;
        }
        return high;

        
    }
}
