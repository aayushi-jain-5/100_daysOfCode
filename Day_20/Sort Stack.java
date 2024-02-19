import java.util.* ;
import java.io.*; 
public class Solution {
	public static Stack<Integer> sortStack(Stack<Integer> s) {
		//Write your code here
		ArrayList<Integer> arr= new ArrayList<>();
		while(!s.empty()){
			arr.add(s.peek());
			s.pop();
		}
		Collections.sort(arr);
		Stack<Integer> st= new Stack<>();
		for(int i=0;i<arr.size();i++){
			st.add(arr.get(i));
		}
		return st;
	}
}
