class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
       } 
       int maxans=-1;
    //    for(Map.Entry<Integer,Integer>en:mp.entrySet()){
    //         int ans=0;
    //         if(en.getKey()==en.getValue()){
    //             ans=en.getKey();
    //             maxans=Math.max(maxans,ans);
    //         }
    //    }
    for(int key:mp.keySet()){
        if(key==mp.get(key)){
            maxans=Math.max(key,maxans);
        }
    }
       return maxans;
    }
}