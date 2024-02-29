public class Solution {
    public static int setBits(int N){
        // Write your code here.
        int x=1;
        while(x<N){
            if((N&x) == 0){
                N=N^x;
                break;
            }
            x=x<<1;
        }
        return (N);
    }
}
