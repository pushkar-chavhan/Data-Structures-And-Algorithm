/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static int getListLength(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // int lenA=getListLength(headA);
        // int lenB=getListLength(headB);
        // while(lenA>lenB &&headA!=null){
        //     lenA--;
        //     headA=headA.next;
        // }
        // while(lenB>lenA &&headB!=null){
        //     lenB--;
        //     headB=headB.next;
        // }
        // while(headA!=headB){
        //     if(headA==null ||headB==null) return null;
        //     headA=headA.next;
        //     headB=headB.next;
        // }
        // return headA;
        ListNode d1 = headA;
        ListNode d2 = headB;
    
    while(d1 != d2) {
        d1 = d1 == null? headB:d1.next;
        d2 = d2 == null? headA:d2.next;
    }
    
    return d1;
    }
}