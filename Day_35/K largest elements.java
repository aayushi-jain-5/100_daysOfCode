import java.util.*;

public class Solution {

	public static ArrayList<Integer> kLargest(int n, int[] nums, int k) {
		// Write your code here
		PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        ArrayList<Integer>arr=new ArrayList<>();
		for(int i=0;i<k;i++){
			arr.add(pq.peek());
			pq.poll();
		}
		return arr;
        

	}
}
