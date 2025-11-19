class Solution {
    public int findFinalValue(int[] nums, int original) {
        TreeSet<Integer>set=new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(!set.contains(original)){
            return original;
        }
        while(set.contains(original)){
            original=original*2;
        }
        return original;
    }
}