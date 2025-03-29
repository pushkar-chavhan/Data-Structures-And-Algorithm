class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []arr=s.split(" ");
        if(arr.length!=pattern.length()){
            return false;
        }
        Map<Character,String>hm=new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
        
            char ch=pattern.charAt(i);
            boolean containskey=hm.containsKey(ch);
            
            if(hm.containsValue(arr[i])&&!containskey){
                return false;
            }
            if(containskey && !hm.get(ch).equals(arr[i])){
                return false;
            }
            else{
                hm.put(ch,arr[i]);
            }
            
        }
        return true;
    }
}