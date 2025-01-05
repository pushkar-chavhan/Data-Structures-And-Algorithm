class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder result=new StringBuilder();
        if(!word.contains(String.valueOf(ch))){
            return word;
        }
        int idx=word.indexOf(ch);
        String ToReverse=word.substring(0,idx+1);
        String  reverse=new StringBuilder(ToReverse).reverse().toString();
        return reverse+word.substring(idx+1);
    }
}