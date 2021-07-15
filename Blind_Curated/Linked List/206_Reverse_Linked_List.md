Given the head of a singly linked list, reverse the list, and return the reversed list.

Constraints:
```
The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
``` 
Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

Solution(Python3):
```
# Iteratively

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev, cur = None, head
        
        while cur:
            # this would become a circle
            nxt = cur.next
            cur.next = prev
            prev = cur
            cur = nxt 
        return prev

# Recursively

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        return self._reverse(head)
        
    def _reverse(self, node, prev = None):
        if not node:
            return prev
        # otherwise
        n = node.next
        node.next = prev
        return self._reverse(n, node)

# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/reverse-linked-list/
```
