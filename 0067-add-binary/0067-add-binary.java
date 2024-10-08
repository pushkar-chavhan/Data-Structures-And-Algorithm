import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // Convert binary strings to BigInteger
        BigInteger intA = new BigInteger(a, 2);
        BigInteger intB = new BigInteger(b, 2);
        
        // Add the two BigIntegers
        BigInteger sum = intA.add(intB);
        
        // Convert the sum back to a binary string
        return sum.toString(2);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.addBinary("1010", "1011"));  // Output: "10101"
    }
}
