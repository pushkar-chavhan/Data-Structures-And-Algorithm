import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]  // max heap: sort by value descending
        );

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
            
            // Start adding to result only when we reach the window size
            if (i >= k - 1) {
                // Remove elements outside the window
                while (pq.peek()[1] <= i - k) {
                    pq.poll();
                }
                res.add(pq.peek()[0]);
            }
        }

        // Convert List<Integer> to int[]
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
