public class Solution{
    public static int countSetBits(int n) {
        //Write your code here
         if(n==0)
        return 0;
        
        int x = larPowOf2(n);
        int y = x * (1 << (x - 1));
        int z = n - (1 << x);
        return y + z + 1 + countSetBits(z);
    }
    
    static int larPowOf2(int n) {
        int x = 0;
        while((1 << x) <= n)
            x++;
        
        return x - 1;
        
    }
}
