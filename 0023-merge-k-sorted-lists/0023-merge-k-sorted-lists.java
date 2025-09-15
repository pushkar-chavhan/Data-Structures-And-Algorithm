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

    ListNode mergeTwoSortedList(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val<=l2.val){
            l1.next=mergeTwoSortedList(l1.next,l2);
            return l1;
        }
        else{
            l2.next=mergeTwoSortedList(l1,l2.next);
            return l2;
        }
    }
    ListNode partitionAndMerge(int start,int end,ListNode[]list){
        if(start==end){
            return list[start];
        }
        if(start>end){
            return null;
        }
        int mid= start+(end-start)/2;
        ListNode l1=partitionAndMerge(start,mid,list);
        ListNode l2=partitionAndMerge(mid+1,end,list);
        return mergeTwoSortedList(l1,l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0){
            return null;
        }
        return partitionAndMerge(0,n-1,lists);

        //using heap
        // if(lists==null||lists.length==0) return null;
        // //sglyat pahle sglya list cha fist element queue mdhe insertkarach 
        // PriorityQueue<ListNode>heap=new PriorityQueue<>((a,b)->a.val-b.val);
        // for(ListNode node:lists){
        //     if(node!=null){
        //         heap.offer(node);
        //     }
        // }
        // //ek dummy list gheun tyat smaller element cha next elemet takayach heap mdhe
        // ListNode dummy=new ListNode(0);
        // ListNode current=dummy;
        // while(!heap.isEmpty()){
        //     ListNode smallest=heap.poll();
        //     current.next=smallest;
        //     current=current.next;
        //     if(smallest.next!=null){
        //         heap.offer(smallest.next);
        //     }
        // }
        // return dummy.next;
    }
}