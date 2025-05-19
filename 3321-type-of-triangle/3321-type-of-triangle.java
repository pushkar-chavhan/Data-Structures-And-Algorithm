class Solution {
    public String triangleType(int[] nums) {
        Set<Integer>Demo=new HashSet<>();
        if(nums.length!=3){
            return "none";
        }
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        for(int i=0;i<nums.length;i++){
            if(!Demo.contains(nums[i])){
                Demo.add(nums[i]);
            }
        }
        if(Demo.size()==1){
                return "equilateral";
            }
            else if(Demo.size()==2){
                return "isosceles";
            }
            else if(Demo.size()==3){
                return "scalene";
            }
        return "none";
    }
}