class Solution {
    public boolean checkString(String s) {
        char arr[]=s.toCharArray();
        boolean seenB=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='b'){
                seenB=true;
            }
            if(seenB && arr[i]=='a'){
                return false;
            }
        }
        return true;
    }
}