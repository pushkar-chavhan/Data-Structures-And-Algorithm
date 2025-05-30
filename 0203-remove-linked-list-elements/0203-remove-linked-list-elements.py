# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        dummy=ListNode()
        dummy.next=head
        current,prev=head,dummy
        while current:
            if current.val==val:
                prev.next=current.next
            else:
                prev=current
            current=current.next
        return dummy.next
