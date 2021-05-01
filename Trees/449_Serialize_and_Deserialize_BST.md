Serialization is converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your serialization/deserialization algorithm should work. You need to ensure that a binary search tree can be serialized to a string, and this string can be deserialized to the original tree structure.

The encoded string should be as compact as possible.

Solution(Python3):
```
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:

    def serialize(self, root: TreeNode) -> str:
        """Encodes a tree to a single string.
        """
        postorder = []
        def dfs(node):
            if not node:
                postorder.append("None")
                return
            dfs(node.left)
            dfs(node.right)
            postorder.append(str(node.val))
        dfs(root)
        return " ".join(postorder)
        
    def deserialize(self, data: str) -> TreeNode:
        """Decodes your encoded data to tree.
        """
        def dfs(postorder):
            if postorder[-1] == "None":
                postorder.pop()
                return
            node = TreeNode(postorder.pop())
            node.right = dfs(postorder)
            node.left = dfs(postorder)
            return node
        return dfs(data.split())
```
Link: https://leetcode.com/problems/serialize-and-deserialize-bst/
