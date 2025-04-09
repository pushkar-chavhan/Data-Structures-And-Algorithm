class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean in_bar=false;
        for(char ch:s.toCharArray()){
            if(ch=='|'){
                in_bar=!in_bar;
            }
            else if(ch=='*' &&!in_bar){
                count++;
            }
        }
        return count;
    }
}