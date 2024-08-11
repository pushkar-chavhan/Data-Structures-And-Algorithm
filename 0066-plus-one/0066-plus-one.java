class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            //if the current digit is less than just increment and return it
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            //if digit is 9 set it to 0
            digits[i]=0;
        }
        //If all the digits were 9, we need a new array with an extra digit
        int[] newdigits=new int[n+1];
        newdigits[0]=1;//set first digit as 1 other will remain 0 by default
        return newdigits;
    }
}