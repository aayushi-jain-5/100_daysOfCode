import java.util.*;
public class Solution {
    
        // Write your code here.
        public static List<List<Integer>> combSum(int[] candidates, int target) {
        List<List<Integer>>res =new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        Arrays.sort(candidates);

        helper(0,temp,res,target,candidates);
        return res;
        
    }
    public static void helper(int ind,List<Integer> temp,List<List<Integer>>res,int target,int[] candidates){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(target<0 || ind>=candidates.length) return;
        for(int i=ind;i<candidates.length;i++){
            temp.add(candidates[i]);
            helper(i,temp,res,target-candidates[i],candidates);
            temp.remove(temp.size()-1);
        }
    }
    
}
