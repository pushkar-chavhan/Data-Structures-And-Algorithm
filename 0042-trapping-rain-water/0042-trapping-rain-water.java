class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // int[] left=new int [n];
        // int [] right=new int [n];
        // left[0]=height[0];
        // for(int i=1;i<n;i++){//first travere from left and check left[i]>height[i]
        //     left[i]=Math.max(left[i-1],height[i]);
        // }
        // right[n-1]=height[n-1];
        // for(int i=n-2;i>=0;i--){//traversse from right
        //     right[i]=Math.max(right[i+1],height[i]);
        // }
        // int ans=0;
        // for(int i=0;i<n;i++){
        //     ans+=Math.min(left[i],right[i])-height[i];
        // }
        // return ans;
        int lmax = 0, rmax = 0, total = 0;
        int l = 0, r = n - 1;
        while (l < r) {
            if (height[l] <= height[r]) {
                if (lmax > height[l]) {
                    total += lmax - height[l];
                } else {
                    lmax = height[l];

                }
                l += 1;
            } else {
                if (rmax > height[r]) {
                    total += rmax - height[r];
                } else {
                    rmax = height[r];

                }
                r -= 1;
            }

        }
        return total;
    }
}