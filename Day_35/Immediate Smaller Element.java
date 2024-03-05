public class Solution {
    public static void immediateSmaller(int []a) {
        // Write your code here.
        int i=0,j=1;
        while( i<(a.length)-1){
            if(a[i]>a[j] && j<(a.length)){
                a[i++]=a[j];
                j++;
            }
            else{
                a[i++]= -1;
                j++;
            }
        }
        a[(a.length) -1]= -1;
        
    }
}
