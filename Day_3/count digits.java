public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int cnt=0;
        int x= n;
        while(n>0){
            int digit= n%10;
            if( digit !=0 && x%digit==0 ){
                cnt++;
            }
            

            n=n/10;
        }
        return cnt;

    }
}
