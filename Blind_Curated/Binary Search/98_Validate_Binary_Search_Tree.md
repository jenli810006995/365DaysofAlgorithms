Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

Constraints:
```
The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1
```
Solution(Ptyhon3):
```
class Solution:
    def isValidBST(self, root: TreeNode, lessThan = float('inf'), largerThan = float('-inf')) -> bool:
        if not root:
            return True
            
        if root.val <= largerThan or root.val >= lessThan:
            return False
        return self.isValidBST(root.left, min(lessThan, root.val), largerThan) and self.isValidBST(root.right, lessThan, max(largerThan, root.val))

# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/validate-binary-search-tree/
```
