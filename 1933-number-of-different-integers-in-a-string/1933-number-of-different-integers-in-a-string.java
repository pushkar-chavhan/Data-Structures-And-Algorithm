class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String>uniqueInteger=new HashSet<>();
        int n=word.length();
        int i=0;
        while(i<n){
            if(Character.isDigit(word.charAt(i))){
                int j=i;
                while(j<n && Character.isDigit(word.charAt(j))){
                    j++;
                }
                String num=word.substring(i,j).replaceFirst("^0+","");
                if(num.isEmpty()) num="0";
                uniqueInteger.add(num);
                i=j;
            }
            else{
                i++;
            }
        }
        return uniqueInteger.size();
    }
}