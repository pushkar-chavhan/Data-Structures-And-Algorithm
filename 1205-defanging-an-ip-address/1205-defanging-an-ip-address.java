class Solution {
    public String defangIPaddr(String address) {
        int n=address.length();
        String s="";
        for(int i=0;i<n;i++){
            char ch =address.charAt(i);
            if(ch!='.'){
                s=s+ch;
            }else{
                s=s+"[.]";
            }
        }
        return s;
    }
}