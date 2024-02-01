public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=n;j>n-i;j--){
                System.out.print((char)(64+j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
