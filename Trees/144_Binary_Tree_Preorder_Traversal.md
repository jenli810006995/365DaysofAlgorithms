Given the root of a binary tree, return the preorder traversal of its nodes' values.

Constraints:
The number of nodes in the tree is in the range [0, 100].
```
-100 <= Node.val <= 100
``` 
Follow up: Recursive solution is trivial, could you do it iteratively?

Solution:
```
# Recursive
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        self.dfs(root, res)
        return res
        
    def dfs(self, root, res):
        if root:
            res.append(res.val)
            self.dfs(root.left, res)
            self.dfs(root.right, res)
            

# Iterative
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ret = []
        stack = [root] # Iterative starts with creating a stack
        while stack:
            node = stack.pop()
            ret.append(node.val)
            stack.append(node.right)
            stack.append(node.left) # the algo traverse from the left side, first in first out
        return ret
            
        
# TC: O(2^n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/binary-tree-preorder-traversal/
```
