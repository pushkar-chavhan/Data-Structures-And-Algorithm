class Solution {
    public int maxVowels(String s, int k) {
        int maxVowel=0;
        int windowVowel=0;
        Set<Character>vowel=new HashSet<>();
        vowel.add('a');vowel.add('e');vowel.add('i');vowel.add('o');vowel.add('u');
        for(int i=0;i<k;i++){
            if(vowel.contains(s.charAt(i))){
                windowVowel++;
                maxVowel=windowVowel;
            }

        }
        for(int i=k;i<s.length();i++){
            if(vowel.contains(s.charAt(i-k))){
                windowVowel--;
            }
            if(vowel.contains(s.charAt(i))){
                windowVowel++;
            }
            maxVowel=Math.max(windowVowel,maxVowel);
        }
        return maxVowel;
    }
}