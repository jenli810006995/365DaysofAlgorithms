In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
Return true if and only if the nodes corresponding to the values x and y are cousins.

Solution(Python3):
```
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        # To save the depth of the first node
        self.recorded_depth = None
        self.is_cousin = False
        
    def dfs(self, node, depth, x, y):
        if node is None:
            return False
            
     # Dont go beyond the depth restricted by the first node found
     if self.recorded_depth and depth > self.recorded_depth:
         return False
         
     if node.val == x or node.val == y:
         if self.recorded_depth is None:
             # save the depth for the first node
             self.recorded_depth = depth
         # Return true, if the second node is found at the same depth
         return self.recorded_depth == depth
         
     left = self.dfs(node.left, depth + 1, x, y)
     right = self.dfs(node.right, depth + 1, x, y)
     
     # self.recorded_depth != depth + 1 would ensure node x and node y are not immediate child nodes
     # otherwise they would become siblings
     if left and right and self.recorded_depth != depth +1:
         self.is_cousin = True
     return left or right
     
     def isCousins(self, root: TreeNode, x: int, y : int) -> bool:
         # Recurse the tree to find x and y
         self.dfs(root, 0, x, y)
         return self.is_cousin
     
# TC: O(n), n is the number of nodes in the binary tree
# SC: O(n), this is becoz the maximum amount of space utilized by the recursion stack would be n, as the height of a skewed binary tree would be, at worse, n
```

```
Link: https://leetcode.com/problems/cousins-in-binary-tree/
```

