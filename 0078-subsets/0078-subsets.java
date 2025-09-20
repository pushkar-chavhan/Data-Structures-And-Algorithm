class Solution {
    public void solve(int i,int[]nums,List<Integer>ds,List<List<Integer>>result){
        if(i>=nums.length){
            result.add(new ArrayList<Integer>(ds));
            return;
        }
        ds.add(nums[i]);
        solve(i+1,nums,ds,result);
        ds.remove(ds.size()-1);
        solve(i+1,nums,ds,result);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        solve(0,nums,ds,result);
        return result;




    //    List<List<Integer>> ans = new ArrayList<>();

    //     int n=nums.length;
    //     int subset=1<<n;
    //     for(int num=0;num<subset;num++){
    //         List<Integer>li=new ArrayList<>();
    //         for(int i=0;i<n;i++){
    //             if((num & (1<<i))!=0){
    //                 li.add(nums[i]);
    //             }
                
    //         }
    //         ans.add(li);
    //     }
    //     return ans;



    }
}