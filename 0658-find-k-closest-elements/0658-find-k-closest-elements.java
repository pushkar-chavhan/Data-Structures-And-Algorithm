class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //Using two Pointers:

        // int n=arr.length;
        // int left=0;
        // int right=n-1;
        // while(right-left+1>k){
        //     if(Math.abs(arr[left]-x)>Math.abs(arr[right]-x)){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        // }
        // ArrayList<Integer>result=new ArrayList<>();
        // for(int i=left;i<=right;i++){
        //     result.add(arr[i]);
        // }
        // return result;

        //Using heap
         // Max-Heap: store [distance, value]
         PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] == b[0] ? b[1] - a[1] : b[0] - a[0]
        );
        
        for (int num : arr) {
            pq.add(new int[]{Math.abs(num - x), num});
            if (pq.size() > k) {
                pq.poll(); // remove farthest element
            }
        }

        // Collect results
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll()[1]);
        }

        Collections.sort(result); // final result must be sorted
        return result;
    }
}