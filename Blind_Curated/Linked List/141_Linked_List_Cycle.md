Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

Constraints:
```
The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
``` 
Follow up: Can you solve it using O(1) (i.e. constant) memory?

Solution:
```
# Two poiners

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        marker1 = head
        marker2 = head
        
        while marker2 != None and marker2.next != None:
            marker1 = mearker1.next
            marker2 = marker2.next.next
            
            if marker1 == marker2:
                return True
        return False

# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/linked-list-cycle/
```
