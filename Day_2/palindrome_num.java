public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int sum=0;
        int x=n;
        while(n>0){
            int rev = n%10;
            sum= (sum*10)+rev;
            n=n/10;
        }
        if(x==sum)
        return true;
        else
        return false;
    }
}
