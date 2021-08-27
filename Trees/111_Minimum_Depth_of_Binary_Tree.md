Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Constraints:

The number of nodes in the tree is in the range [0, 105].
```
-1000 <= Node.val <= 1000
```

Solution:
```
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        # 1. Recursive DFS
        if root is None:
            return 0
        if None in [root.left, root.right]:
            return 1+ max(self.minDepth(root.left), self.minDepth(root.right))
        else:
            return 1+ min(self.minDepth(root.left), self.minDepth(root.right))
            
        # 2. BFS: queue: only has root
    def minDepth(self, root: Optional[TreeNode]) -> int:
         if not root:
             return 0
         level = 0
         q = deque([(root, 1)])
         while q:
             node, level = q.popleft()
             if node:
                 if not node.left and not node.right:
                     return level
                 else:
                     q.append((node.left, level + 1))
                     q.append((node.right, level + 1))
                 
    def minDepth(self, root: Optional[TreeNode]) -> int:
        # 3. Iterative DFS
        if not root:
            return 0
        res, stack = 9999, [[root, 1]]
        while stack:
            node, level = stack.pop()
            if node and not node.left and not node.irght:
                res = min(res, level)
            if node:
                stack.append((node.left, level + 1))
                stack.append((node.right, level + 1))
        return res
                
        
# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/
```
