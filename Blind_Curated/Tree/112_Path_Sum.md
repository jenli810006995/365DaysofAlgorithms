Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

Constraints:
```
The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000
```
Solution(Python3):
```
# Recursive
class Solution:
    def hasPathSum(self, root: TreeNode, targetSum: int) -> bool:
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if not root:
            return False
            
        
        if not root.left and not root.right and root.val == targetSum: # it is a leaf w/ children
            return True
            
        targetSum -= root.val
            
        return self.hasPathSum(root.left, targetSum) or self.hasPathSum(root.right, targetSum)
        
# TC: O(n)
# SC: O(1)
            
```
```
Link:https://leetcode.com/problems/path-sum/
```
