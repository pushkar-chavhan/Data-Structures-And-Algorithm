class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer>count_map=new HashMap<>();
        for(String str:arr){
            count_map.put(str,count_map.getOrDefault(str,0)+1);
        }
        int distict_count=0;
        for(String str:arr){
            if(count_map.get(str)==1){
                distict_count++;
                if(distict_count==k){
                    return str;
                }
            }
        }
        return "";
    }
}