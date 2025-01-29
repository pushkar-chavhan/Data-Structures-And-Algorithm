class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        if(n==0){
            return new int[0];
        }
        TreeSet<Integer>uniqueElem=new TreeSet<>();
        for(int ele:arr){
            uniqueElem.add(ele);
        }
        HashMap<Integer,Integer>ranks=new HashMap<>();
        int rank=1;
        for(int ele:uniqueElem){
            ranks.put(ele,rank++);
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=ranks.get(arr[i]);
        }
        return ans;
    }
}