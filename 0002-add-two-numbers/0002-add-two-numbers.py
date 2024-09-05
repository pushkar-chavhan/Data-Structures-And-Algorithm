# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0)  # Dummy node to handle result
        current = dummy
        carry = 0
        
        while l1 or l2:
            x = l1.val if l1 else 0
            y = l2.val if l2 else 0
            sum_val = carry + x + y
            
            carry = sum_val // 10  # Update carry
            current.next = ListNode(sum_val % 10)  # Current digit of the sum
            current = current.next
            
            if l1: l1 = l1.next
            if l2: l2 = l2.next
        
        if carry > 0:
            current.next = ListNode(carry)  # Add carry if it remains after the loop
        
        return dummy.next