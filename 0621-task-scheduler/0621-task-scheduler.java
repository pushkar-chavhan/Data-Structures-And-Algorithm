class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;
        }
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int f:freq){
            if(f>0){
                maxHeap.add(f);
            }
        }
        int time=0;
        while(!maxHeap.isEmpty()){
            List<Integer>temp=new ArrayList<>();
            int cycle=n+1;
            while(cycle>0&&!maxHeap.isEmpty()){
                temp.add(maxHeap.poll());
                cycle--;
                time++;
            }
            for (int remaining : temp) {
                if (--remaining > 0) {
                    maxHeap.add(remaining);
                }
            }

            // If heap is empty, no need to add idle time at the end
            if (maxHeap.isEmpty()) break;

            // Otherwise, fill up the rest of the cycle with idle time
            time += cycle;
        }
        return time;
    }
}