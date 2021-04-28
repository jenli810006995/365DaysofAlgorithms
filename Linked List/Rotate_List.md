```
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if head is None or head.next is None:
            return head
            
        length = 0
        start = head
        prev = None
        
        while start:
            length += 1
            prev = start
            start = start.next
            
        k = k % length
        
        if k == length or k == 0:
            return head
            
        prev.next = head
        prev = None
        
        for i in range(length - k):
            prev = head
            head = head.next
            
        prev.next = None
        return head
```

Link: https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1295/
Reference: https://leetcode.com/problems/rotate-list/discuss/1180024/Python-Simplest-solution-or-100-faster
