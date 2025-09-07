class Solution {
    public List<Integer> majorityElement(int[] nums) {
    //    int cnt1=0;
    //    int cnt2=0;
    //    int ele1=Integer.MIN_VALUE;
    //     int ele2=Integer.MIN_VALUE;
    //         for(int i=0;i<nums.length;i++){
    //             if(cnt1==0&&nums[i]!=ele2){
    //                 cnt1=1;
    //                 ele1=nums[i];
    //             }
    //             else if(cnt2==0&&nums[i]!=ele1){
    //                 cnt2=1;
    //                 ele2=nums[i];
    //             }
    //             else if(nums[i]==ele1){
    //                 cnt1++;
    //             }
    //             else if(nums[i]==ele2){
    //                 cnt2++;
    //             }
    //             else{
    //                 cnt1--;
    //                 cnt2--;
    //             }
    //         }
    //         List<Integer>ls=new ArrayList<>();
    //         cnt1=0;cnt2=0;
    //         for(int i=0;i<nums.length;i++){
    //             if(ele1==nums[i])cnt1++;
    //             if(ele2==nums[i])cnt2++;
    //         }
    //         int mini=(int)(nums.length/3)+1;
    //         if(cnt1>=mini)ls.add(ele1);
    //         if(cnt2>=mini)ls.add(ele2);
    //         return ls;
    

    //Brute
        List<Integer>result=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>n/3&&!result.contains(nums[i])){
                result.add(nums[i]);
                count=0;
            }
        }
        return result;
    }
}