class Solution {
    public String defangIPaddr(String address) {
        String res="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)!='.'){
                res+=address.charAt(i);
            }
            else if(address.charAt(i)=='.'){
                res+="[.]";
            }
        }
        return res;
    }
}