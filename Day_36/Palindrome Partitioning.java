import java.util.*;
public class Solution {
    public static List<List<String>> partition(String s) {
        // Write your code here.
       
        List<List<String>> res= new ArrayList<>();

        List<String> path=new ArrayList<>();
        func(0,s,path,res);
        return res;
        
    }
    public static void func(int index,String s, List<String> path,List<List<String>>res){
        if(index== s.length()){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i=index ;i<s.length();i++){
            if(isPal(s,index,i)){
                path.add(s.substring(index,i+1));
                func(i+1,s,path,res);
                path.remove(path.size()-1);

            }
        }
    }
    public static boolean isPal(String s,int index,int i){
        int start=index,end=i;
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
            return false;
        }
        return true;

    }
}
    
