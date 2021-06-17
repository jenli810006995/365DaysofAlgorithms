Given the head of a linked list, return the list after sorting it in ascending order.
```
Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?
```
Solution(Python3):
Top down merge sort
```
class Solution(object):
    def merge(self, h1, h2):
        dummy = tail = ListNode(None)
        while h1 and h2:
            if h1.val < h2.val:
                tail.next, h1 = h1, h1.next
            else:
                tail.next, h2 = h2, h2.next
            tail = tail.next
            
        tail.next = h1 or h2
        return dummy.next
        
    def sortList(self, head):
        if not head or not head.next:
            return head
            
        pre, slow, fast = None, head, head
        while fast and fast.next:
            pre, slow, fast = slow, slow.next, fast.next.next
        pre.next = None
        
        return self.merge(*map(self.sortList, (head, slow)))

# TC: O(nlogn), merge and sort takes nlogn
# SC: O(logn)

```
```
Link: https://leetcode.com/problems/sort-list/
```
