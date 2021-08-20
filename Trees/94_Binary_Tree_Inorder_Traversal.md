Given the root of a binary tree, return the inorder traversal of its nodes' values.

Constraints:

The number of nodes in the tree is in the range [0, 100].
```
-100 <= Node.val <= 100
``` 
Follow up: Recursive solution is trivial, could you do it iteratively?

Solution:
```
# Recursively

class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        res = []
        return self.helper(root, res)
        return res
        
    def helper(self, root, res):
        if root:
            if root.left:
                self.helper(root.left, res)
            res.append(root.val)
            if root.right:
                self.helper(root.right, res)
                
# Iteratively

class Solution:
    def inorderTraversal(self, root):
        res, stack = [], []
        cur = root
        while True:
            while cur:
                stack.append(cur)
                cur = cur.left
            if not stack:
                return res
            cur = stack.pop()
            res.append(cur.val)
            cur = cur.right
            
```

```
Link: https://leetcode.com/problems/binary-tree-inorder-traversal/

```
