class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        int max=0;
        int ans=0;
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>e:mp.entrySet()){
           int freq=e.getValue();
           if(freq>max){
            max=freq;
            ans=freq;
           }
           else if(freq==max){
            ans+=freq;
           }
        }
        return ans;
    }
}