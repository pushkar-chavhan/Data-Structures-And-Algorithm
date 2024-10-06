# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:  # If the list is empty, return None
            return None
        
        odd = head
        even = head.next
        evenHead = even  # Keep track of the head of the even list
        
        # Rearranging the nodes
        while even and even.next:
            odd.next = odd.next.next  # Move odd pointer to the next odd node
            odd = odd.next            # Update odd
            
            even.next = even.next.next  # Move even pointer to the next even node
            even = even.next            # Update even
            
        odd.next = evenHead  # Connect odd list to even list
        
        return head  # Return the rearranged list
