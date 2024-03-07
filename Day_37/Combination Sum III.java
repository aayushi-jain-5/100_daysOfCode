import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    static ArrayList<ArrayList<Integer>> combinationSum3(int k, int n) {

        // Write your code here.
        ArrayList<ArrayList<Integer>>ans= new ArrayList<>();
        func(k,n,ans,new ArrayList<>(),1,0);
        return ans;

    }
    static void func(int k,int n,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>temp,int start,int sum){
        if(temp.size()==k){
            if(sum==n){
                ans.add(new ArrayList<>(temp));
            }
            return ;
        }
        for(int i=start;i<10;i++){
            if(sum+i<=n){
                temp.add(i);
                func(k,n,ans,temp,i+1,sum+i);
                temp.remove(temp.size()-1);
            }
            else break;
        }

    }
}
