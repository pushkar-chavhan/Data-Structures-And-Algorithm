class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean isVowel=false;
        boolean isConsonant=false;
        for(char ch:word.toCharArray()){
            if(Character.isLetter(ch)){
                ch=Character.toLowerCase(ch);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    isVowel=true;
                }
                else{
                    isConsonant=true;
                }
            }
            else if(!Character.isDigit(ch)){
                return false;
            }
        }
        return isVowel&&isConsonant;
    }
}