/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        //find the middle number off list
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse list from mid(slow)to right side
        ListNode prev=null;
        while(slow!=null){
           ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        //compare last and first elements of list

        ListNode first_half=head;
        ListNode second_half=prev;
        while(second_half!=null){
            if(first_half.val!=second_half.val){
                return false;
            }
            first_half=first_half.next;
            second_half=second_half.next;
        }
        return true;
    }
}