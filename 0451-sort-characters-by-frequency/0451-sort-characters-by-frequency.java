class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        for(char i:s.toCharArray()){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Character>chars=new ArrayList<>(mp.keySet());
        chars.sort((a, b) -> mp.get(b) - mp.get(a));
        StringBuilder sb=new StringBuilder();
        for(char c:chars){
            int count=mp.get(c);
            for(int i=0;i<count;i++){
                sb.append(c);
            }

        }
        return sb.toString();
    }
}