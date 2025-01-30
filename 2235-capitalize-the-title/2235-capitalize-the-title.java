class Solution {
    public String capitalizeTitle(String title) {
        String[] words=title.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=3){
                words[i]=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
            }
            else{
                words[i]=words[i].toLowerCase();
            }
            result.append(words[i]);
            if(i!=words.length-1){
                result.append(" ");
            }
        }
        return result.toString();
    }

}