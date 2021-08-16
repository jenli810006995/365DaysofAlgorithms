Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Constraints:
```
The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
``` 
Follow up: Could you solve it both recursively and iteratively?

Recursive Solution:
```
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if root is None:
            return True
        return self.isMirror(root.left, root.right)
    def isMirror(self, tree1, tree2):
        if tree1 is None or tree2 is None:
            return tree1 == tree2
        if tree.val != tree2.val:
            return False
        else:
            return self.isMirror(tree1.left, tree2.right) and self.isMirror(tree1.right, tree2.left)
```
Iterative Solution:
```
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if root is None:
            return True
            
        stack = [(root.left, root.right)]
        while stack:
            left, right = stack.pop()
            if left is None and right is None:
                continue
            if left is None or right is None:
                return False
            if left.val == right.val:
                stack.append((left.left, right.right))
                stack.append((right.left, left.right))
                
            else:
                return False
        return True
        
# TC: O(b), the number of nodes
# SC: O(logn)
```
```
Link: https://leetcode.com/problems/symmetric-tree/
```
