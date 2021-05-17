Given the head of a linked list and two integers m and n. Traverse the linked list and remove some nodes in the following way:
```
Start with the head as the current node.
Keep the first m nodes starting with the current node.
Remove the next n nodes
Keep repeating steps 2 and 3 until you reach the end of the list.
Return the head of the modified list after removing the mentioned nodes.
```
Follow up question: How can you solve this problem by modifying the list in-place?

Solution(Python3):
```
# Use an indicator i to count the number of already-passed list nodes
# keep moving head node forward as long as i < m - 1
# remove the next n nodes and reset i = 0 when i = m - 1

class Solution:
  def deleteNodes(self, head: ListNode, m : int, n : int) -> ListNode:
      dummy = ListNode(None)
      dummy.next = head
      
      i = 0
      while head:
          if i < m - 1:
              i += 1
          else:
              j = 0
              while j < n and head.next: # the indicator j < n and there is head.next
                  head.next = head.next.next # move forward
                  j += 1
              i = 0 # reset i to 0 when i = m - 1
          head = head.next
      return dummy.next
      
# TC: O(N)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/
Credit: https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/discuss/681256/Python-One-Pass-In-Place-with-O(n)-time-and-O(1)-space-with-explanation
```
