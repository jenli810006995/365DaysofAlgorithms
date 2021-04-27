You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.

Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.

Example 1:
```
Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
Output: [1,2,3,7,8,11,12,9,10,4,5,6]
```
Constraints:

The number of Nodes will not exceed 1000.
1 <= Node.val <= 105

Solution(Python3):
```
"""
# Definition for a Node.
class Node:
    def __init__(self, val, prev, next, child):
        self.val = val
        self.prev = prev
        self.next = next
        self.child = child
"""

class Solution:
    def flatten(self, head: 'Node') -> 'Node':
        node = head
        
        while node:
        
            if node.child:
                old_next = node.next
                # recursion
                node.next = self.flatten(node.child)
                node.next.prev = node
                node.child = None # erasing the node.child
                
                while node.next: # if node.next exist
                    node = node.next # iterating
                node.next = old_next
                
                if old_next:
                    old_next.prev = node
            
            # if no node.child
            node = node.next
        
        return head
```

Link: https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1225/
