class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer>result=new ArrayList<>();
        Set<Integer>s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        for(int i=1;i<=n;i++){
            if(!s.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}