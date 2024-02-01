public class Solution {
    public static void alphaHill(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(' ');
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j));
                System.out.print(' ');
            }
            for(int j=i-1;j>0;j--){
                System.out.print((char)(64+j));
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
