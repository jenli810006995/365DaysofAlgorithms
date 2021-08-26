Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

Constraints:

The number of nodes in the tree is in the range [0, 5000].
```
-104 <= Node.val <= 104
```

Solution:
```
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        # by no more than 1 means <= 1
        if root is None:
            return True
        else:
            return self.get_height(root) != -1
        
    def get_height(self, node):
        if node is None:
            return 0
        # define left and right
        left = self.get_height(node.left)
        right = self.get_height(node.right)
        if left == -1 or right == -1 or abs(left - right) > 1:
            return -1
        return max(left, right) + 1

# TC: O(n), n is the number of nodes
# SC: O(h), h is the height of the tree, because if we learned that the left subtree is not balanced, we do not go check the right subtree
```
```
Link: https://leetcode.com/problems/balanced-binary-tree/
```
