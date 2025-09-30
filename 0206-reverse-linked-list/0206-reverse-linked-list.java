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
    public ListNode reverseList(ListNode head) {
        // ListNode current=head;
        // ListNode previous=null;
        // while(current!=null){
        //     ListNode temp=current.next;
        //     current.next=previous;
        //     previous=current;
        //     current=temp;
        // }
        // return previous;


        //using recursion
        // if(head==null || head.next==null){
        //     return head;
        // }
        // ListNode newHead=reverseList(head.next);
        // head.next.next=head;
        // head.next=null;
        // return newHead;


        //Striver-recursion
        if(head==null || head.next==null){
            return head;
        }
        ListNode newNode=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newNode;
    }
}