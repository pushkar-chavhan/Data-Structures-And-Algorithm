class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int result[]=new int[2];
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int i=0;
        for(Map.Entry<Integer,Integer>en:mp.entrySet()){
            if(en.getValue()==2){
                result[i++]=en.getKey();
            }
        }
        return result;
    }
}