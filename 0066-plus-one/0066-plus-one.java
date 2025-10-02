class Solution {
    public int[] plusOne(int[] digits) {
        // List<Integer> res = new ArrayList<>();
        // String dumm = "";
        // for (int num : digits) {
        //     dumm += num;
        // }
        // long plus = Long.parseLong(dumm) + 1;
        // String ans = String.valueOf(plus);
        // for (char c : ans.toCharArray()) {
        //     res.add(c - '0');
        // }
        // int[] result = new int[res.size()];
        // for (int i = 0; i < res.size(); i++) {
        //     result[i] = res.get(i);
        // }
        // return result;

        //best approach:
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        // If all digits were 9, create new array [1,0,0,...,0]
        int res[]=new int[digits.length+1];
        res[0]=1;
        return res;
    }
}