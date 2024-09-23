class Solution {
    public int divide(int dividend, int divisor) {
        // Special case: handle overflow when dividend is Integer.MIN_VALUE and divisor is -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // If both are the same, return 1
        if (dividend == divisor) {
            return 1;
        }

        // Determine the sign of the result
        boolean sign = (dividend > 0) == (divisor > 0);

        // Convert to long to handle overflow and take absolute values
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        int ans = 0;

        while (n >= d) {
            int cnt = 0;
            while (n >= (d << (cnt + 1))) {
                cnt++;
            }

            ans += (1 << cnt);  // Add the current quotient contribution
            n -= (d << cnt);    // Subtract the corresponding value from the dividend
        }

        return sign ? ans : -ans;
    }
}
