Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

Constraints:
```
The number of nodes in the tree is in the range [0, 5000].
-104 <= Node.val <= 104
```
Solution:

```
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        # use recursive, so I have to create another function called getHeight()
        if root is None: # if root is None, it is balanced
            return True
        return self.getHeight(root) != -1
        
    def getHeight(self, node):
        if node is None:
            return 0
            
        # define two variables left and right
        left = self.getHeight(node.left)
        right = self.getHeight(node.right)
        
        if (left == -1) or (right == -1) or (abs(left - right) > 1):
            return -1
            
        return max(left, right) + 1
```
```
Link: https://leetcode.com/problems/balanced-binary-tree/
```
