class Solution {
    public boolean isPalindrome(int n) {
       if(n<0) return false;
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
    
