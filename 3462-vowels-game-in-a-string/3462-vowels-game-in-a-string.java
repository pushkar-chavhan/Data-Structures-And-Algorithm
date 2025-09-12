class Solution {
    public boolean doesAliceWin(String s) {
        int vowelcount=0;
        boolean alice=false;
        boolean bob=false;
        int j=0;
        for(int i=0;i<s.length();i++){
            while(j<s.length()){
                char c=s.charAt(j);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowelcount++;
                }
                if(vowelcount%2!=0){
                    alice=true;
                }else{
                    bob=true;
                }
                j++;
            }
        }
        return alice;
    }
}