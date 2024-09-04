public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the head of the list
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize current and previous pointers
        ListNode current = head;
        ListNode prev = dummy;
        
        while (current != null) {
            if (current.val == val) {
                // Skip the current node
                prev.next = current.next;
            } else {
                // Move the prev pointer forward
                prev = current;
            }
            // Move the current pointer forward
            current = current.next;
        }
        
        // Return the new head of the list
        return dummy.next;
    }
}
