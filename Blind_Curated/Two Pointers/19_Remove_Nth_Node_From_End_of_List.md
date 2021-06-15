Given the head of a linked list, remove the nth node from the end of the list and return its head.

Solution(Python3):
```
class Solution:
  def removeNthFromEnd(self, head, n):
      fast = slow = head
      for _ in range(n):
          fast = fast.next
      if not fast:
          return head.next
      while fast.next:
          fast = fast.next
          slow = slow.next
      slow.next = slow.next.next
      return head

# TC: O(L), L is the length of the list
# SC: O(1)

```
```
Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
```
