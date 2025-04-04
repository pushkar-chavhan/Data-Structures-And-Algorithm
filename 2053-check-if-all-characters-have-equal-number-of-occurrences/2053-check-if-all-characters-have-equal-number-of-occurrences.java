class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>str=new HashMap<>();
        for(char ch:s.toCharArray()){
            str.put(ch,str.getOrDefault(ch,0)+1);//count occurances
        }
        int firstCount=-1;
        for(int count:str.values()){
            if(firstCount==-1){
                firstCount=count;
            }
            else if(firstCount!=count){
                return false;
            }
        }
        return true;
    }
}