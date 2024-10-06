# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        
        # Step 1: Split the list into two halves
        mid = self.getMid(head)
        left = head
        right = mid.next
        mid.next = None
        
        # Step 2: Sort each half
        left = self.sortList(left)
        right = self.sortList(right)
        
        # Step 3: Merge the sorted halves
        return self.merge(left, right)
    
    # Function to find the middle node of the linked list
    def getMid(self, head: ListNode) -> ListNode:
        slow, fast = head, head
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
        return slow
    
    # Function to merge two sorted lists
    def merge(self, left: ListNode, right: ListNode) -> ListNode:
        dummy = ListNode()
        tail = dummy
        while left and right:
            if left.val < right.val:
                tail.next = left
                left = left.next
            else:
                tail.next = right
                right = right.next
            tail = tail.next
        if left:
            tail.next = left
        else:
            tail.next = right
        return dummy.next