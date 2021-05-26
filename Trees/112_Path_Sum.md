Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
A leaf is a node with no children.

Solution(Python3):
```
# use recursive
class Solution:
    def hasPathSum(self, root: TreeNode, targetSum: int) -> bool:
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if not root:
            return False
        targetSum -= root.val
        if not root.left and not root.right: # it is a leaf w/t children
            return targetSum == 0
        return self.hasPathSum(root.left, targetSum) or self.hasPathSum(root.right, targetSum)

# TC: O(n), n is the number of nodes
# SC: O(n) in worse scenario and O(longn) in best scenario(balanced tree)

```
```
Link: https://leetcode.com/problems/path-sum/
```
