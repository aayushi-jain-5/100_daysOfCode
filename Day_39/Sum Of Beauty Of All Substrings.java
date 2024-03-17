public class Solution {
    public static int sumOfBeauty(String s) {
        // Write your code here.
        int result=0;
        
        
        for(int i=0;i<s.length();i++){
            int[] freq= new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int max= Integer.MIN_VALUE;
                int min =Integer.MAX_VALUE;
                

                for(int f:freq){
                    if(f>0){
                        max= Math.max(max,f);
                        min=Math.min(min,f);
                    }
                }
                result+=  (max-min);
            }
            
        }
        return result;
    }
}
