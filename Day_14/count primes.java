import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> countPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        
        for (int num = 2; num < n; num++) {
            if (isPrime(num)) {
                if(n%num==0)
                primes.add(num);
            }
        }
        
        return primes;
    }
    
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
