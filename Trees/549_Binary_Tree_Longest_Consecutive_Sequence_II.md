Given the root of a binary tree, return the length of the longest consecutive path in the tree.

This path can be either increasing or decreasing.
```
For example, [1,2,3,4] and [4,3,2,1] are both considered valid, but the path [1,2,4,3] is not valid.
On the other hand, the path can be in the child-Parent-child order, where not necessarily be parent-child order.
```

Solution(Python3):
```
# DFS

class Solution:
  def longestConsecutive(self, root: TreeNode) -> int:
        """
        :type root: TreeNode
        :rtype: int
        """
        def dfs(node, parent):
            if not node:
                return 0, 0
            li, ld = dfs(node.left, node)
            ri, rd = dfs(node.right, node)
            l[0] = max(l[0], li + rd + 1, ld + ri+ 1)
            if node.val == parent.val + 1:
                return max(li, ri) + 1, 0
            if node.val == parent.val - 1:
                return 0, max(ld, rd) + 1
            return 0, 0
        l = [0]
        dfs(root, root)
        return l[0]
# TC: O(n)
# SC: O(n)

```
```
Link: https://leetcode.com/problems/binary-tree-longest-consecutive-sequence-ii/
Credit: https://leetcode.com/problems/binary-tree-longest-consecutive-sequence-ii/discuss/101520/DFS-C%2B%2B-Python-solutions
