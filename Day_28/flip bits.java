       public class Solution {
    public static int flipBits(int A, int B){
        // Write your code here.
        int cnt=0;
        int flip=A^B;
        while(flip!=0){
            if((flip&1)==1){
                flip=flip>>1;
            cnt++;
            }
            else
                flip=flip>>1;
        }
        return cnt;
    }
}
