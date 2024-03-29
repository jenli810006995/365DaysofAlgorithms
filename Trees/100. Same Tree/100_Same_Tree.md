Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Constraints:
```
The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
```

Solution:
```
class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        if not p and not q:
            return True
        if not p or not q:
            return False
        if p.val != q.val:
            return False
        else:
            if self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right):
                return True

# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/same-tree/
```
