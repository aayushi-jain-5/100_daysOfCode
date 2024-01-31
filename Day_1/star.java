public class Solution {
    public static void nStarDiamond(int n) {
        // Write your code here
        for(int i = 0; i < n; i++){
            for(int j = n - i - 1; j > 0; j--){
                System.out.print(' ');
            }
            for(int k = 0; k <2 * i + 1; k++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int l = 0; l < n; l++){
            for(int o = 0; o <l ; o++){
                System.out.print(' ');
            }
            for(int m = 2 * n - 1; m > 2 * l ; m--){
                System.out.print('*');
            }
            
            System.out.println();
        }
        
    }
}
