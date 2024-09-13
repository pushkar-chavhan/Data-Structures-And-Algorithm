class Solution {
    public int singleNonDuplicate(int[] nums) {
    //   int x=0;
    //   for(int i=0;i<nums.length;i++){
    //     x=x^nums[i];
    //   }
    //   return x;

    int start=0;
    int end=nums.length-1;
    while(start<end){
        int mid=start+(end-start)/2;
        //check rigth side me even hai ya odd
        boolean isEven;
        if((end-mid)%2==0){
            isEven=true;
        }
        else{
            isEven=false;
        }
        //check adjuscent element

        if(nums[mid]==nums[mid+1]){
            if(isEven){
                start=mid+2;
            }
            else{
                end=mid-1;
            }
        }
        else{//nums[mid]!=nums[mid+1]
            if(isEven){
                end=mid;
            }
            else{
                start=mid+1;
            }

        }
    }
    return nums[end];
    }
}