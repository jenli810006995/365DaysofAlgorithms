Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Constraints:

The number of nodes in the tree is in the range [0, 104].
```
-100 <= Node.val <= 100
```

Solution(Breadth-First Search):
```
class Solution:
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        depth = 0
        level = [root] if root else []
        while level:
            depth += 1
            queue = []
            for el in level:
                if el.left:
                    queue.append(el.left)
                if el.right:
                    queue.append(el.right)
            level = queue
            
        return depth
# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
```
