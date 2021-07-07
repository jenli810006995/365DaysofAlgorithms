Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.

If the tree has more than one mode, return them in any order.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.

Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).

Solution(Python3):
```
class Solution:
  prev = None
  max_count = 0
  current_count = 0
  result = []
  
  def findMode(self, root):
      self.dfs(root)
      return self.result
      
  def dfs(self, node):
      if not node:
          return
          
      self.dfs(node.left)
      self.current_count = 1 if node.val != self.prev else self.current_count + 1
      if self.current_count == self.max_count:
          self.result.append(node.val)
          
      elif self.current_count > self.max_count:
          self.result = [node.val]
          self.max_count = self.current_count
      self.prev = node.val
      self.dfs(node.right)
      
# TC: O(n)
# SC: O(1)

```
```
Link: https://leetcode.com/problems/find-mode-in-binary-search-tree/
```
