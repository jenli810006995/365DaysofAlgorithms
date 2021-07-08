Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Constraints:
```
The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
```

Solution(Python3):
```
class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        if p and q:
            return p.val == q.val and self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
        return p is q

# TC: O(n)
# SC: O(logn)
```
```
Link: https://leetcode.com/problems/same-tree/
```
