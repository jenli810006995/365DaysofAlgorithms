You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:
```
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
```
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Follow up:

You may only use constant extra space.
Recursive approach is fine, you may assume implicit stack space does not count as extra space for this problem.

Solution(Python3):
```
"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Node') -> 'Node':
        if not root:
            return root
            
        # initialize a queue data structure which contains just the root of the tree
        Q = collections.deque([root])
        
        # Outer while loop which iterates over each level
        while Q:
            # Note the size of the node
            size = len(Q)
            
            # Iterate all the nodes on the current level
            for i in range(size):
                # pop a node from the front of the node
                node = Q.popleft()
                
                if i < size - 1:
                    node.next = Q[0]
                    
                # Add the children, if any, to the back of the queue
                
                if node.left:
                    Q.append(node.left)
                if node.right:
                    Q.append(node.right)
                    
               # since the tree now has been modified, return the root node
        return root
        
# TC: O(N)
# SC: O(N)
```
Link: https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
