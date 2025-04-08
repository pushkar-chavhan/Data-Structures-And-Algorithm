class Solution {
    public int findLHS(int[] nums) {
        int max_len=0;
        Map<Integer,Integer>freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int key:freq.keySet()){
            if(freq.containsKey(key+1)){
                int length=freq.get(key)+freq.get(key+1);
                max_len=Math.max(max_len,length);
            }
        }
        return max_len;
    }
}