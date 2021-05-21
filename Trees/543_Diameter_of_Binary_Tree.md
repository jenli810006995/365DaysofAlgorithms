Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.

Solution(Python3):
```
class Solution:
    def diameterOfBinaryTree(self, root: TreeNode) -> int:
        # DFS, recursive
        diameter = 0
        
        def longest_path(node):
            if not node:
                return 0
            nonlocal diameter
            # recursively find the longest path in both left and right child
            
            left_path = longest_path(node.left)
            right_path = longest_path(node.right)
            
            # update the diameter if left plus right is larger
            diameter = max(diameter, left_path + right_path)
            
            # return the longest one b/w left and right
            # rememeber to add 1 for the path connecting the node and its parent
            return max(left_path, right_path) + 1
            
        longest_path(root)
        return diameter
# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/diameter-of-binary-tree/
```
