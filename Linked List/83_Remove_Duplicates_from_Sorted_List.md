Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Solution(Python3):
```
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        cur = head
        while cur:
            while cur.next and cur.next.val == cur.val: # meaning there are duplicates
                # skip duplicates
                cur.next = cur.next.next
            cur = cur.next # no duplicates of current node, move to next node
        return head
          
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

```
