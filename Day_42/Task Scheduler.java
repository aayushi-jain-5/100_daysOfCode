import java.util.* ;
import java.io.*; 
public class Solution {
    public static int taskScheduler(String s, int N, int k) {

        // Write your code here.
        char tasks[]=s.toCharArray();
        int[] counter = new int[26];
        int maxF = 0; // max_freq
        int maxFc = 0; // no of ch having max_freq
        for (char task : tasks) {
            counter[task - 'A']++;
        }
        for (int x : counter)
        {
            if(maxF==x)
            {
                 maxFc++;
            }
            if(maxF<x)
            {
                maxF=x;
                maxFc=1;
            }
        }
        
        // System.out.print(maxF+" " + maxFc);  // AAAA BB C - maxF =4, maxFc=1;
        // numnber of gaps req - why?  obv rest of ele counts less that maxF, they can be arranged in the gaps.
        int gaps = maxF-1;
        int gaps_len = k - (maxFc - 1);
        
        // empty slot = number of gaps * gaps_len
        int avail_slot = gaps * gaps_len;
        
        int avail_task = N - maxF * maxFc;
        
        //place availabe task in total avail slot and rest as idle
        int idles = Math.max(0, avail_slot - avail_task);
        
        return N+idles;
    }

}
