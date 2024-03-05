import java.util.Scanner;

import java.util.PriorityQueue;

public class solution {
    static int minCost(int arr[], int n) {
        /*
         * Your class should be named Solution.Don't write main().Don't take
         * input, it is passed as function argument.Don't print output.Taking
         * input and printing output is handled automatically.
         */
         PriorityQueue<Integer>pq= new PriorityQueue<>();
         for(int i=0;i<n;i++){
             pq.add(arr[i]);
         }
         int ans=0;
        while(pq.size()>1){
             
             int a=pq.poll();
            
             int b=pq.poll();
             int sum=a+b;
             ans+=sum;
             pq.add(sum);
         }
        return  ans;

    }
}
