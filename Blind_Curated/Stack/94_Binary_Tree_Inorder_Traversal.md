Given the root of a binary tree, return the inorder traversal of its nodes' values.

Constraints:
```
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
``` 
Follow up: Recursive solution is trivial, could you do it iteratively?

Solution(Python3):
```
# Recursive
class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        res = []
        self.helper(root, res)
        return res
        
    def helper(self, root, res):
        if root:
            self.helper(root.left, res)
            res.append(root.val)
            self.helper(root.right, res)

# TC: O(n)
# SC: O(n)

# Iterative
class Solution:
    def inorderTraversal(self, root):
        res,stack = [], []
        while true:
            while root:
                stack.append(root)
                root = root.left
                
            if not stack:
                return res
                
            node = stack.pop()
            res.append(node.val)
            root = node.right
# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/binary-tree-inorder-traversal/
```
