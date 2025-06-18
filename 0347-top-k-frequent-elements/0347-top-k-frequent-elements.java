class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[]bucket=new List [nums.length+1];
        Map<Integer,Integer>freqMap=new HashMap<>();
        for(int n:nums){
            freqMap.put(n,freqMap.getOrDefault(n,0)+1);//frequency table kela
        }
        //bucket mdhe freq. wise value//keys add kelya
        for(int key:freqMap.keySet()){
            int frequency=freqMap.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        //ek result navacha array ghetla tyat bucket la magun traverse karun value add kelya
        int res[]=new int[k];
        int counter=0;
        for(int pos=bucket.length-1;pos>=0&&counter<k;pos--){
            if(bucket[pos]!=null){
                for(Integer integer:bucket[pos]){
                    res[counter++]=integer;
                }
            }
        }
        return res;
    }
}