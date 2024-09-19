class Solution {
    private static final int MOD = 1_000_000_007;//10^9+7
    
    public long modExp(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
    
    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;  // number of even-indexed positions
        long oddPositions = n / 2;         // number of odd-indexed positions
        
        long result = (modExp(5, evenPositions, MOD) * modExp(4, oddPositions, MOD)) % MOD;
        return (int) result;
    }
}
