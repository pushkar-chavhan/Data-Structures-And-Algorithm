class Solution {
    public int singleNonDuplicate(int[] nums) {
    //   int x=0;
    //   for(int i=0;i<nums.length;i++){
    //     x=x^nums[i];
    //   }
    //   return x;

    // int start=0;
    // int end=nums.length-1;
    // while(start<end){
    //     int mid=start+(end-start)/2;
    //     //check rigth side me even hai ya odd
    //     boolean isEven;
    //     if((end-mid)%2==0){
    //         isEven=true;
    //     }
    //     else{
    //         isEven=false;
    //     }
    //     //check adjuscent element

    //     if(nums[mid]==nums[mid+1]){
    //         if(isEven){
    //             start=mid+2;
    //         }
    //         else{
    //             end=mid-1;
    //         }
    //     }
    //     else{//nums[mid]!=nums[mid+1]
    //         if(isEven){
    //             end=mid;
    //         }
    //         else{
    //             start=mid+1;
    //         }

    //     }
    // }
    // return nums[end];




//Striver method
    int n=nums.length;
    if(n==1)return nums[0];
    if(nums[0]!=nums[1])return nums[0];
    if(nums[n-1]!=nums[n-2]) return nums[n-1];
    int low=1;
    int high=nums.length-2;
    while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
            return nums[mid];
        }
        if(mid%2==1 && nums[mid]==nums[mid-1]||
            mid%2==0 && nums[mid]==nums[mid+1]
        ){
            low=mid+1;//eliminate left half
        }
        else{
            high=mid-1;//eliminate right half
        }
    }
    return -1;
    }
}