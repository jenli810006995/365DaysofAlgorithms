You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Solution(Python3):
```
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        last = None
        while head:
            # keep the next node
            tmp = head.next
            # reverse the link
            head.next = last
            # update the last node and the current node
            last = head
            head = tmp
        return last
    
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        # reverse lists
        l1 = self.reverseList(l1)
        l2 = self.reverseList(l2)
        
        head = None
        carry = 0
        while l1 or l2:
            # get the current values
            x1 = l1.val if l1 else 0
            x2 = l2.val if l2 else 0
            
            # current sum and carry
            val = (carry + x1 + x2) % 10
            carry = (carry + x1 + x2) // 10
            
            # update the result : add to front
            curr = ListNode(val)
            curr.next = head
            head = curr
            
            # move to the next elements in the list
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            
        if carry:
            curr = ListNode(carry)
            curr.next = head
            head = curr
            
        return head

TC: O(N1+N2)
SC: O(1)
```
